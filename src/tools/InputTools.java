package tools;
/*
 * 1.提供私有的构造方法
 * 2.提供静态方法返回值为当前类.对象
 * 3.提供静态成员变量.类型是当前类类型
 * 4.在方法中提供if判断，如果实例为null则new
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
