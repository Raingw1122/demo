package tools;
/*
 * 1.�ṩ˽�еĹ��췽��
 * 2.�ṩ��̬��������ֵΪ��ǰ��.����
 * 3.�ṩ��̬��Ա����.�����ǵ�ǰ������
 * 4.�ڷ������ṩif�жϣ����ʵ��Ϊnull��new
 */
//
public class InputTools {

	private static InputTools instance;
	private InputTools() {}
	public static InputTools getInstance() {
		if(instance==null) {
			instance=new InputTools();
		}
		return instance;
	}
	
	public int getInt() {
		return 0;
	}
	public int getByte() {
		return 0;
	}
	public int getShort() {
		return 0;
	}
	public int getChar() {
		return 0;
	}
	public int getFloat() {
		return 0;
	}
	public int getDouble() {
		return 0;
	}
	public int getBoolean() {
		return 0;
	}
	
	
}
