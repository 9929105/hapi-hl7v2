package ca.uhn.hl7v2.model.v25.datatype;

import ca.uhn.hl7v2.model.Composite;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractType;
import ca.uhn.log.HapiLogFactory;

/**
 * <p>The HL7 CE (Coded Element) data type.  Consists of the following components: </p><ol>
 * <li>Identifier (ST)</li>
 * <li>Text (ST)</li>
 * <li>Name of Coding System (ID)</li>
 * <li>Alternate Identifier (ST)</li>
 * <li>Alternate Text (ST)</li>
 * <li>Name of Alternate Coding System (ID)</li>
 * </ol>
 */
public class CE extends AbstractType implements Composite {

	private Type[] data;

	/**
	 * Creates a CE.
	 * @param message the Message to which this Type belongs
	 */
	public CE(Message message) {
		super(message);
		data = new Type[6];
		data[0] = new ST(message);
		data[1] = new ST(message);
		data[2] = new ID(message, 396);
		data[3] = new ST(message);
		data[4] = new ST(message);
		data[5] = new ID(message, 396);
	}

	/**
	 * Returns an array containing the data elements.
	 */
	public Type[] getComponents() { 
		return this.data; 
	}

	/**
	 * Returns an individual data component.
	 * @throws DataTypeException if the given element number is out of range.
	 */
	public Type getComponent(int number) throws DataTypeException { 

		try { 
			return this.data[number]; 
		} catch (ArrayIndexOutOfBoundsException e) { 
			throw new DataTypeException("Element " + number + " doesn't exist in 6 element CE composite"); 
		} 
	} 
	/**
	 * Returns Identifier (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getIdentifier() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Text (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getText() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Name of Coding System (component #2).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getNameOfCodingSystem() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(2);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Alternate Identifier (component #3).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getAlternateIdentifier() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(3);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Alternate Text (component #4).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getAlternateText() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(4);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Name of Alternate Coding System (component #5).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getNameOfAlternateCodingSystem() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(5);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}