package ca.uhn.hl7v2.model.v23.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v23.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the PGL_PC8_PROBLEM Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PRB (Problem Detail) <b></b><br>
 * 1: NTE (Notes and comments segment) <b>optional repeating</b><br>
 * 2: VAR (Variance) <b>optional repeating</b><br>
 * 3: PGL_PC8_PROBLEM_ROLE (a Group object) <b>optional repeating</b><br>
 * 4: PGL_PC8_PROBLEM_OBSERVATION (a Group object) <b>optional repeating</b><br>
 */
public class PGL_PC8_PROBLEM extends AbstractGroup {

	/** 
	 * Creates a new PGL_PC8_PROBLEM Group.
	 */
	public PGL_PC8_PROBLEM(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PRB.class, true, false);
	      this.add(NTE.class, false, true);
	      this.add(VAR.class, false, true);
	      this.add(PGL_PC8_PROBLEM_ROLE.class, false, true);
	      this.add(PGL_PC8_PROBLEM_OBSERVATION.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating PGL_PC8_PROBLEM - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns PRB (Problem Detail) - creates it if necessary
	 */
	public PRB getPRB() { 
	   PRB ret = null;
	   try {
	      ret = (PRB)this.get("PRB");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of NTE (Notes and comments segment) - creates it if necessary
	 */
	public NTE getNTE() { 
	   NTE ret = null;
	   try {
	      ret = (NTE)this.get("NTE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of NTE
	 * (Notes and comments segment) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public NTE getNTE(int rep) throws HL7Exception { 
	   return (NTE)this.get("NTE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of NTE 
	 */ 
	public int getNTEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("NTE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Returns  first repetition of VAR (Variance) - creates it if necessary
	 */
	public VAR getVAR() { 
	   VAR ret = null;
	   try {
	      ret = (VAR)this.get("VAR");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of VAR
	 * (Variance) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public VAR getVAR(int rep) throws HL7Exception { 
	   return (VAR)this.get("VAR", rep);
	}

	/** 
	 * Returns the number of existing repetitions of VAR 
	 */ 
	public int getVARReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("VAR").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Returns  first repetition of PGL_PC8_PROBLEM_ROLE (a Group object) - creates it if necessary
	 */
	public PGL_PC8_PROBLEM_ROLE getPROBLEM_ROLE() { 
	   PGL_PC8_PROBLEM_ROLE ret = null;
	   try {
	      ret = (PGL_PC8_PROBLEM_ROLE)this.get("PROBLEM_ROLE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PGL_PC8_PROBLEM_ROLE
	 * (a Group object) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PGL_PC8_PROBLEM_ROLE getPROBLEM_ROLE(int rep) throws HL7Exception { 
	   return (PGL_PC8_PROBLEM_ROLE)this.get("PROBLEM_ROLE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PGL_PC8_PROBLEM_ROLE 
	 */ 
	public int getPROBLEM_ROLEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PROBLEM_ROLE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Returns  first repetition of PGL_PC8_PROBLEM_OBSERVATION (a Group object) - creates it if necessary
	 */
	public PGL_PC8_PROBLEM_OBSERVATION getPROBLEM_OBSERVATION() { 
	   PGL_PC8_PROBLEM_OBSERVATION ret = null;
	   try {
	      ret = (PGL_PC8_PROBLEM_OBSERVATION)this.get("PROBLEM_OBSERVATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PGL_PC8_PROBLEM_OBSERVATION
	 * (a Group object) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PGL_PC8_PROBLEM_OBSERVATION getPROBLEM_OBSERVATION(int rep) throws HL7Exception { 
	   return (PGL_PC8_PROBLEM_OBSERVATION)this.get("PROBLEM_OBSERVATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PGL_PC8_PROBLEM_OBSERVATION 
	 */ 
	public int getPROBLEM_OBSERVATIONReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PROBLEM_OBSERVATION").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

}
