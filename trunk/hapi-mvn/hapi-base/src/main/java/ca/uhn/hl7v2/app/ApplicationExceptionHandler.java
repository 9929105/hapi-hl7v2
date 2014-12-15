/**
The contents of this file are subject to the Mozilla Public License Version 1.1 
(the "License"); you may not use this file except in compliance with the License. 
You may obtain a copy of the License at http://www.mozilla.org/MPL/ 
Software distributed under the License is distributed on an "AS IS" basis, 
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for the 
specific language governing rights and limitations under the License. 

The Original Code is "Application.java".  Description: 
"From an HL7 messaging perspective, a consumer of a messages" 

The Initial Developer of the Original Code is University Health Network. Copyright (C) 
2002.  All Rights Reserved. 

Contributor(s): ______________________________________. 

Alternatively, the contents of this file may be used under the terms of the 
GNU General Public License (the  �GPL�), in which case the provisions of the GPL are 
applicable instead of those above.  If you wish to allow use of your version of this 
file only under the terms of the GPL and not to allow others to use your version 
of this file under the MPL, indicate your decision by deleting  the provisions above 
and replace  them with the notice and other provisions required by the GPL License.  
If you do not delete the provisions above, a recipient may use your version of 
this file under either the MPL or the GPL. 
 */

package ca.uhn.hl7v2.app;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;

/**
 * The Interface ApplicationExceptionHandler. Allow applications to handle
 * parsing and handling errors
 * 
 * @author Gabriel Landais
 * @see Application
 */
public interface ApplicationExceptionHandler<T extends Message> extends Application<T> {

	/**
	 * Process an exception.
	 * 
	 * @param incomingMessage
	 *            the incoming message. This is the raw message which was
	 *            received from the external system
	 * @param outgoingMessage
	 *            the outgoing message. The response NAK message generated by
	 *            HAPI.
	 * @param e
	 *            the exception
	 * @return The new outgoing message. This can be set to the value provided
	 *         by HAPI in <code>outgoingMessage</code>, or may be replaced with
	 *         another message.
	 */
	public String processException(String incomingMessage, String outgoingMessage, Exception e) throws HL7Exception;

}
