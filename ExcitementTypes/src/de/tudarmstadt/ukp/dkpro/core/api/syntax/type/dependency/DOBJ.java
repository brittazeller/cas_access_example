

/* First created by JCasGen Wed Aug 29 14:25:48 CEST 2012 */
package de.tudarmstadt.ukp.dkpro.core.api.syntax.type.dependency;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Aug 29 14:25:48 CEST 2012
 * XML source: /home/tailblues/Dropbox/excitement_expr/ExcitementTypes/typesystem/desc/type/Dependency.xml
 * @generated */
public class DOBJ extends Dependency {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DOBJ.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected DOBJ() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public DOBJ(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public DOBJ(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public DOBJ(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
}

    