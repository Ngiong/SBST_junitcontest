/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package hep.aida.swig;
 
import hep.aida.jni.AIDAJNIUtil;

public class IInfoStyle extends IBaseStyle implements hep.aida.IInfoStyle {
  private long swigCPtr;

  public IInfoStyle(long cPtr, boolean cMemoryOwn) {
    super(AIDAJNI.SWIGIInfoStyleUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(hep.aida.IInfoStyle obj) {
    if (obj instanceof IInfoStyle) {
      return (obj == null) ? 0 : ((IInfoStyle)obj).swigCPtr;
    } else {
      long cPtr = AIDAJNI.new_IInfoStyle();
      // FIXME, memory leak if Java class gets finalized, since C++ director is not freed.
      AIDAJNI.IInfoStyle_director_connect(obj, cPtr, true, true);
      return cPtr;
    }
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AIDAJNI.delete_IInfoStyle(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    AIDAJNI.IInfoStyle_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    AIDAJNI.IInfoStyle_change_ownership(this, swigCPtr, true);
  }

  public hep.aida.ITextStyle textStyle() {
    return new ITextStyle(AIDAJNI.IInfoStyle_textStyle(swigCPtr, this), false);
  }

  public boolean setTextStyle(hep.aida.ITextStyle textStyle) {
    return AIDAJNI.IInfoStyle_setTextStyle(swigCPtr, this, ITextStyle.getCPtr(textStyle), (hep.aida.ITextStyle)textStyle);
  }

  public IInfoStyle() {
    this(AIDAJNI.new_IInfoStyle(), true);
    AIDAJNI.IInfoStyle_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}