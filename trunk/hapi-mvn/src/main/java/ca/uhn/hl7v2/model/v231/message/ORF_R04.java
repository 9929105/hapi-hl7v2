package ca.uhn.hl7v2.model.v231.message;

import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v231.group.*;

import ca.uhn.hl7v2.model.v231.segment.*;

import ca.uhn.hl7v2.HL7Exception;

import ca.uhn.hl7v2.parser.ModelClassFactory;

import ca.uhn.hl7v2.parser.DefaultModelClassFactory;

import ca.uhn.hl7v2.model.AbstractMessage;

/**
 * <p>Represents a ORF_R04 message structure (see chapter ?). This structure contains the 
 * following elements: </p>
 * 0: MSH (MSH - message header segment) <b></b><br>
 * 1: MSA (MSA - message acknowledgment segment) <b></b><br>
 * 2: QRD (QRD - original-style query definition segment) <b></b><br>
 * 3: QRF (QRF - original style query filter segment) <b>optional </b><br>
 * 4: ORF_R04_PIDNTEORCOBRNTEOBXNTECTI (a Group object) <b>repeating</b><br>
 * 5: ERR (ERR - error segment) <b>optional </b><br>
 * 6: QAK (Query Acknowledgement) <b>optional </b><br>
 * 7: DSC (DSC - Continuation pointer segment) <b>optional </b><br>
 */
public class ORF_R04 extends AbstractMessage  {

	/** 
	 * Creates a new ORF_R04 Group with custom ModelClassFactory.
	 */
	public ORF_R04(ModelClassFactory factory) {
	   super(factory);
	   init(factory);
	}

	/**
	 * Creates a new ORF_R04 Group with DefaultModelClassFactory. 
	 */ 
	public ORF_R04() { 
	   super(new DefaultModelClassFactory());
	   init(new DefaultModelClassFactory());
	}

	private void init(ModelClassFactory factory) {
	   try {
	      this.add(MSH.class, true, false);
	      this.add(MSA.class, true, false);
	      this.add(QRD.class, true, false);
	      this.add(QRF.class, false, false);
	      this.add(ORF_R04_PIDNTEORCOBRNTEOBXNTECTI.class, true, true);
	      this.add(ERR.class, false, false);
	      this.add(QAK.class, false, false);
	      this.add(DSC.class, false, false);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating ORF_R04 - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns MSH (MSH - message header segment) - creates it if necessary
	 */
	public MSH getMSH() { 
	   MSH ret = null;
	   try {
	      ret = (MSH)this.get("MSH");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns MSA (MSA - message acknowledgment segment) - creates it if necessary
	 */
	public MSA getMSA() { 
	   MSA ret = null;
	   try {
	      ret = (MSA)this.get("MSA");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns QRD (QRD - original-style query definition segment) - creates it if necessary
	 */
	public QRD getQRD() { 
	   QRD ret = null;
	   try {
	      ret = (QRD)this.get("QRD");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns QRF (QRF - original style query filter segment) - creates it if necessary
	 */
	public QRF getQRF() { 
	   QRF ret = null;
	   try {
	      ret = (QRF)this.get("QRF");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of ORF_R04_PIDNTEORCOBRNTEOBXNTECTI (a Group object) - creates it if necessary
	 */
	public ORF_R04_PIDNTEORCOBRNTEOBXNTECTI getPIDNTEORCOBRNTEOBXNTECTI() { 
	   ORF_R04_PIDNTEORCOBRNTEOBXNTECTI ret = null;
	   try {
	      ret = (ORF_R04_PIDNTEORCOBRNTEOBXNTECTI)this.get("PIDNTEORCOBRNTEOBXNTECTI");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ORF_R04_PIDNTEORCOBRNTEOBXNTECTI
	 * (a Group object) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ORF_R04_PIDNTEORCOBRNTEOBXNTECTI getPIDNTEORCOBRNTEOBXNTECTI(int rep) throws HL7Exception { 
	   return (ORF_R04_PIDNTEORCOBRNTEOBXNTECTI)this.get("PIDNTEORCOBRNTEOBXNTECTI", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ORF_R04_PIDNTEORCOBRNTEOBXNTECTI 
	 */ 
	public int getPIDNTEORCOBRNTEOBXNTECTIReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PIDNTEORCOBRNTEOBXNTECTI").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Returns ERR (ERR - error segment) - creates it if necessary
	 */
	public ERR getERR() { 
	   ERR ret = null;
	   try {
	      ret = (ERR)this.get("ERR");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns QAK (Query Acknowledgement) - creates it if necessary
	 */
	public QAK getQAK() { 
	   QAK ret = null;
	   try {
	      ret = (QAK)this.get("QAK");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns DSC (DSC - Continuation pointer segment) - creates it if necessary
	 */
	public DSC getDSC() { 
	   DSC ret = null;
	   try {
	      ret = (DSC)this.get("DSC");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}
