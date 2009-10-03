/**
 * The contents of this file are subject to the Mozilla Public License Version 1.1
 * (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.mozilla.org/MPL/
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for the
 * specific language governing rights and limitations under the License.
 *
 * The Original Code is "AbstractPrimitive.java".  Description:
 * "Base class for Primitives.  Performs validation in setValue()."
 *
 * The Initial Developer of the Original Code is University Health Network. Copyright (C)
 * 2001-2005.  All Rights Reserved.
 *
 * Contributor(s): ______________________________________.
 *
 * Alternatively, the contents of this file may be used under the terms of the
 * GNU General Public License (the  �GPL�), in which case the provisions of the GPL are
 * applicable instead of those above.  If you wish to allow use of your version of this
 * file only under the terms of the GPL and not to allow others to use your version
 * of this file under the MPL, indicate your decision by deleting  the provisions above
 * and replace  them with the notice and other provisions required by the GPL License.
 * If you do not delete the provisions above, a recipient may use your version of
 * this file under either the MPL or the GPL.
 *
 */

package ca.uhn.hl7v2.model;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.validation.PrimitiveTypeRule;
import ca.uhn.hl7v2.validation.ValidationContext;

/**
 * Base class for Primitives.  Performs validation in setValue().
 *    
 * @author Bryan Tripp
 */
public abstract class AbstractPrimitive extends AbstractType implements Primitive {
    
    /**
     * @param message message to which this type belongs
     */
    public AbstractPrimitive(Message message) {
        super(message);
    }

    private String myValue;
    
    /** 
     * Returns the value of getValue() 
     * @see java.lang.Object#toString 
     */
    public String toString() {
        return this.getValue();
    }
    
    /**
     * @see ca.uhn.hl7v2.model.Primitive#getValue()
     */
    public String getValue() {
        return myValue;
    }

    /**
     * Sets the value of this Primitive, first performing validation as specified 
     * by <code>getMessage().getValidationContext()</code>.  No validation is performed 
     * if getMessage() returns null. 
     * 
     * @see ca.uhn.hl7v2.model.Primitive#setValue(String)
     */    
    public void setValue(String theValue) throws DataTypeException {
        Message message = getMessage();

        if (message != null) {
            ValidationContext context = message.getValidationContext();
            String version = message.getVersion();

            if (context != null) {
                PrimitiveTypeRule[] rules = context.getPrimitiveRules(version, getName(), this); 
        
                for (int i = 0; i < rules.length; i++) {
                    theValue = rules[i].correct(theValue);
                    if (!rules[i].test(theValue)) {
                        throw new DataTypeException("Failed validation rule for value \"" + theValue + "\": " + rules[i].getDescription());
                    }
                }
            }
        }
        
        myValue = theValue;
    }

    
    /**
     * {@inheritDoc }
     */
    @Override
    public String encode() throws HL7Exception {
        return getValue();
    }


    /**
     * {@inheritDoc }
     */
    @Override
    public void parse(String string) throws HL7Exception {
        setValue(string);
    }
    
}