package com.bee.trans.common.exception;


import com.bee.trans.common.consts.SysErrResponseCode;

public class SysException
  extends RuntimeException
{
  private static final long serialVersionUID = 1429956030966288710L;
  private Object[] params;
  private int code;
  public SysException() {}
  
  public SysException(int code, String message)
  {
    super(message);
    this.code=code;
  }

  public SysException(Throwable cause)
  {
    super(cause);
  }
  
  public SysException(String message, Object[] params)
  {
    super(message);
    this.params = params;
  }
  
  public SysException(String message, Throwable cause)
  {
    super(message, cause);
  }
  
  public SysException(String message, Object[] params, Throwable cause)
  {
    super(message, cause);
    this.params = params;
  }

  public SysException(SysErrResponseCode e) {
    super(e.getMessage());
    this.code=e.getCode();
  }

  public Object[] getParams()
  {
    return this.params;
  }
  
  public void setParams(Object[] params)
  {
    this.params = params;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }
}
