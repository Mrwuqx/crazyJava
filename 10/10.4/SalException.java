

/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class SalException extends Exception
{
	public SalException(){}
	public SalException(String msg)
	{
		super(msg);
	}
	// ����һ�����Խ���Throwable�����Ĺ�����
	public SalException(Throwable t)
	{
		super(t);
	}
}
