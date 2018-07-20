//面向对象对象对象。功能+功能+功能
import java.util.*;
import java.io.*;
import java.lang.*;
/*
 取值
byte2 7     127  1字节   8bit
short2 15   3w   2字节
int2 31     e  默认用 4字节
long2 64             8字节
float 4字节
double 8字节 默认用
char 0-65535 2字节
*/

/*
内存划分
	1.寄存器  CPU
	2.本地方法区  与所在系统相关
	3.方法区   
	4.栈内存
	存储的都是局部变量（定义在“方法”中的都是局部变量）
	而且变量所属的作用域一旦结束，该变量就自动释放
	生命周期比较短，更新速度很快
	主函数
	5.堆内存
	存储的是数组和对象（其实数组就是对象）凡是用new建立的都在堆中
	特点：      1.存储实体，封装多个数据
	      2.每一个实体都有首地址值
	      3.堆内存中的每一个值都有一个默认初始化的值（栈没有），根据类型的不同而不同，整数0，小数0.0或0.0f，字符串null
			Boolean false，插入‘\u0000’（"\ u"即"u e code码"，00  00  两个字节）狗币搞不懂的注释机制
	      4.c/c++指针——java引用
	      5.arr=null
	      6.释放方式，用完以后，垃圾自动回收，不定时，垃圾回收机制      	
*/

/*
简单的输入输出
 	//输入  导包import java.util.Scanner;
 	Scanner s = new Scanner(System.in);
 	a = s.nextInt();
 	//输出
 	System.out.println();
  */

/*
重载
	打印乘法表
	public static void main(String[] args)
	{
	
		//printCFB(9);
		printCFB();
	}
	public static void printCFB(int a)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
	public static void printCFB()
	{
		printCFB(9);
	}
	
	注意：1.同一个类
		2.同名
		3.参数/参数类型不同
		4.函数的重载和返回值类型无关
		5.java是严谨性语言，如果函数出现调用的不确定性，会编译失败
		6.重载以后功能相似，程序代码相似，可以调用比较叼的那个
*/

/*
 数组
	  //数组定义
	    int[] arr = new int[3];
		arr[0] = 9;
		int[] a = new int[]{1,2,3};
		int[] b = {4,5,6};
		
		syso(a)--->[I@15db9742    @前定义实体类型  [是数组型  后是实体的哈希算法处理后的地址值
		
	//数组的存取
	public static void main(String[] args)
	{
		int[] arr = new int[3];
		arr[0] = 9;
		int[] a = new int[]{1,2,3};
		int[] b = {4,5,6};
		for(int i = 0; i < a.length ; i ++)
		{
			System.out.println("a["+i+"]"+"="+a[i]);
		}
		
	}
}

	//数组比较
        int[] arr = new int[5];
		int[] c = new int[2];
		c = getMax(arr);
		System.out.println("最大数为arr数组的第"+c[1]+"位，他的数值为"+c[0]);
	 * 求数组的最大值，此处用数组返回。以后注意更改为定义一个对象还是啥玩意的。
	 public static int[] getMax(int[] arr)
	{
		System.out.println("请输入需要比较的数:");
		//Scanner s = new Scanner(System.in);
		//python   a = input ()
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = s.nextInt();
		}
		int[] b = new int[2];
		b[0] = arr[0] ; b[1] = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (b[0] < arr[i])
			{
				b[0] = arr[i];
				b[1] = i;
			}
		}
		b[1] += 1;
		return b;
	}

//关于什么时候使用数组的问题。
 * 如果数据出现了对应关系，而且对应关系的一方是有序的数字编号，并作为角标使用。 （发现对应关系，没有有规律的数字编号，用map）
         就可以将这些数据存储到数组中，根据运算的结果作为角标直接去查数组中对应的元素。
         查表法！
   
   //获取一个整数的16进制表现形式
		public static void toHex(int num)
		{
			for(int i = 0; i < 8; i++)
			{
				int temp = num & 15;
				if(temp <= 9)
				System.out.print(temp);
				else if(temp > 9)
				{
					System.out.print((char)(temp - 10 + 'A'));
				}
				num = num >>> 4;
			}
		}
	//使用查表法
	public static void toHex_1(int num)
	{
		char[] chs = {'0','1','2','3','4',
					  '5','6','7','8','9',
					  'A','B','C','D','E','F'};
		for(int i = 0; i < 8; i++)
		{
			int temp = num & 15;
			System.out.println(chs[temp]);
			num = num >>> 4;
		}
	}
	//优化
	public static void toHex_2(int num)
	{
		if(num == 0)
		{
			System.out.println('0');
			return ;		//到这马上返回，不执行后面
		}
		char[] chs = {'0','1','2','3','4',
				  '5','6','7','8','9',
				  'A','B','C','D','E','F'};
		char[] arr = new char[8];	//临时容器
		int pos = arr.length;
		while(num != 0)
		{
			int temp = num & 15;	//二进制与1
			arr[--pos] = chs[temp];
			num = num >>> 4;		//二进制右移两位
		}
		for(int i = pos; i < arr.length; i++)
		{
			
			System.out.print(arr[i]);
		}
	}
	//十进制转十六进制
	public static void toHex(int num)
	{
		trans(num,15,4);
	}
	//十进制转二进制
	public static void toBinary(int num)
	{
		trans(num,1,1);
	}
	//十进制转八进制
	public static void toOctal(int num)
	{
		trans(num,7,3);
	}
	public static void trans(int num,int base,int offset)
	{
		if(num == 0)
		{
			System.out.println('0');
			return ;		//到这马上返回，不执行后面
		}
		char[] chs = {'0','1','2','3','4',
				  '5','6','7','8','9',
				  'A','B','C','D','E','F'};
		char[] arr = new char[8];	//临时容器
		int pos = arr.length;
		while(num != 0)
		{
			int temp = num & base;	//二进制与1
			arr[--pos] = chs[temp];
			num = num >>> offset;		//二进制右移两位
		}
		for(int i = pos; i < arr.length; i++)
		{
			
			System.out.print(arr[i]);
		}
	}
	//又是包
	 * syso(Integer.toBinaryString(num));	//toHex,toOctal
*/

/*
二维数组
int[][] arr = new int[3][2];	//创建一个二维数组，该数组中有3个一维数组，每一个一维数组中有2个元素
int[][] arr = new int[3][];		//明确二维数组的长度，不知道一维数组的长度。

//默认初始化null
数组中的元素还是数组，数组中的数组
内存中存地址。
int[][] arr = new int[3][2];
System.out.println(arr);     //[[I@15db9742
System.out.println(arr.length);	//二维诶数组的长度，一维数组的个数
System.out.println(arr[1].length);

int[][] arr = new int[3][];	
syso(arr[0][0]);	//空指针异常

//遍历
int[][] arr = {{1,2,3},{0,8,7},{4}};
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.println(arr[i][j]);
			}
		}
*/

/*
排序
	//选择排序：每次都是跟a[i]比，最大/小值存a[i]  
		int[] arr = new int[5];
		Scanner s = new Scanner(System.in);
		for (int i = 0 ; i < arr.length ; i++)
			{
				arr[i] = s.nextInt();
			}
		selectSort(arr);       //调用函数
		for(int i = 0; i < arr.length; i++)
		System.out.println(arr[i]);	 
		//不用返回，内存空间指向同一个数组空间。
		public static void selectSort(int[] arr)
		{
			for (int i = 0 ; i < arr.length - 1 ; i++)
			{
				for(int j = i ; j < arr.length; j++)
				{
					if (arr[i] < arr[j])
					{
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
	//另一种选择排序，记录数组下标和最值。代码熟，不写了。
	
	//冒泡排序:每一趟比较在arr[arr.length-1]存最大/小值
	 public static void bubbleSort(int[] arr)
	{
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = 0; j < arr.length - 1 - i; j++)  //"-1"避免角标越界  "-i"外循环增加一次让内循环每一次参与比较的元素个数递减
			if(arr[j] > arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	//另一种
	public static void bubbleSort2(int[] arr)
	{
		for(int i = arr.length - 1; x > 0; x--)
		{
			for(int j =0; j < x; j++)
			{
				......
			}
		}
	}
	//希尔排序最快，三层循环，位运算。
	//java有已定义好的函数          Arrays.sort[arr];
	//一个简单的交换函数
	public static void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
*/

/*
查找
//简单查找
public static int getIndex(int[] arr,int key)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == key)
				return i;
		}
		return -1;
	}
	
//二分/折半查找(前提：数组有序。。。有序并涉及查找，先想二分查找。)
 * 然而开发的时候，导包啊。
 * import util.*;
 * int index = Arrays.binarySearch(arr,a);//如果元素存在，返回的是其位置。
 * 											如果元素不存在，返回的是元素的插入点，变成负数再减一。6。为啥减一，万一是0的时候，保证也是个负数。666
public static int halfSearch(int[] arr,int key)
	{
		int max,min,mid;
		max = arr.length - 1;
		min = 0;
		mid = (max + min) / 2;
		while(arr[mid] != key)
		{
			if(key > arr[mid])
				min = mid + 1;
			else if(key < arr[mid])
				max = mid - 1;
			if(max < min)
				return -1;
			mid = (max + min) / 2;
		}
		return mid;
	}
public static int halfSearch_2(int[] arr,int key)
	{
		int max,min,mid;
		max = arr.length - 1;
		min = 0;
		
		while(min <= max)
		{
			mid = (max + min) >> 1;	//二进制右移一位，等于除以2。运算速度快啊。
			if(key > arr[mid])
				min = mid + 1;
			else if(key < arr[mid])
				max = mid - 1;
			else
				return mid;
		}
		return -1;
	}
//面试题：给定一个有序的数组，如果往该数组中存入一个元素，并保证该数组的元素还是有序的，
	         那么这个元素的存储角标如何获取。
public static int halfSearch_2(int[] arr,int key)
	{
		int max,min,mid;
		max = arr.length - 1;
		min = 0;
		
		while(min <= max)
		{
			mid = (max + min) >> 1;	//二进制右移一位，等于除以2。运算速度快啊。
			if(key > arr[mid])
				min = mid + 1;
			else if(key < arr[mid])
				max = mid - 1;
			else
				return mid;
		}
		return min;
	}

 */

/*
面向过程/对象

对于面向过程思想强调的是过程（动作）。--强大的c
对于面向对象思想强调的是对象（实体）。
特点：
1.面向对象就是一种常见的思想。符合人们的思考习惯。
2.面向对象的出现，将复杂的问题简单化。
3.面向对象的出现，让曾经在过程中的执行者变成了对象中的指挥者。

类：
用java语言对现实生活中事物进行描述。
通过类来实现。
对事物描述通常只关注两个方面，一个是属性（数值），一个是行为（动作/行为）。
只要明确该事物的属性和行为并定义在类中即可。

对象：其实就是该类事物实实在在存在的个体。
类的描述产生对象。
new关键字产生该类事物的对象。new建立的对象，都在堆内存中。

类与对象之间的关系：
类：事物的描述
对象：该类事物的实体。在java中通过new来创建。

计算机中先有类，再new对象。现实生活中先有对象。

例：
描述小汽车
分析:
1.属性。
  轮胎数
  颜色
2.行为
  运行

	class CarDemo
	{
		//在计算机中创建car实例，通过new关键字完成
		Car car1 = new Car();	//Car 是类，car1是Car类型的变量，类类型的引用变量,
								//指向了Car类的对象。
		car1.num = 4;
		car1.color = "red";
		car1.run();		//要使用对象中的内容，可以通过 对象.成员 的形式来完成调用。
		
	}
	//提高代码复用性
	
	public static void show(Car c)	//类类型的参数,数据类型变量名等于初始化的格式，类类型的变量一定指向对象或者指空null
	{
		c.num = 6;
		c.color = "black";
	}	  
	
	class Car    //类中的静态方法不能直接调用动态方法，加上static
	{
		int num;  //int num = 4;  //显示初始化。*加载过程
		String color;   //String 不是关键字是类
		void run()	//用函数表示行为
		{
		    //int num = 10;    //局部变量与成员变量的区别.此为局部变量存储在栈内存中。
			System.out.println(num+"..."+color);
		}
	} 
	
定义类其实就是在定义类中的成员。
成员：成员变量--属性；成员函数--行为。
成员变量定义在类中，在类中都有效。局部变量只能在方法/语句中有效。

一旦产生该类对象，这个对象一定具有这个类中描述的内容。

封装的是一个事物中所具备的数据值。


成员变量和局部变量的区别：
1.成员变量定义在类中，整个类中都可以访问。
     局部变量定义在函数、语句、局部代码块中，只有在所属的区域有效。
2.成员变量存在于堆内存的对象中。
      局部变量存在于栈内存的方法中。
3.成员变量随着对象的创建而存在，随着对象的消失而消失。
      局部变量随着所属区域的执行而存在，随着所属区域的结束而释放。
4.成员变量都有默认初始化值，不初始化能用。
      局部变量没有默认初始化值，不初始化不能用。
  //给对象赋值，不是给变量赋值。 像c.color 是对象c中的color。

//匿名对象  没有名字的对象
new Car();	//匿名对象，其实就是定义对象的简写格式。

使用方法：
1.当对象对‘方法’仅进行‘一次’调用的时候，就可以简化成匿名对象。(简写格式)

new Car().run(); == |Car c = new Car();
					|c.run();
new Car() == Car c = new Car();

new Car().num = 5;
new Car().color = "green";
new Car().run;
三行代码，创建了三个对象。1）只有num=5；2）color=“green”；3）num=0；color=null；
new Car()创建对象。执行下一个之前，上一个已经变成垃圾。

2.匿名对象可以作为实际参数作为传递。

show(new Car());//不产生垃圾  == |Car c1 = new Car();
							 |show(c1);
							 
//基本数据类型参数传递
class Demo {	
	public static void main(String[] args)
	{
		int x= 3;
		show(x);
		System.out.println("x="+x);
	}
	public static void show(int x)
	{
		x = 4;
		System.out.println("x=="+x);
	}
	
}
//x==4   x=3

//引用数据类型参数传递
class Demo()
{
	int x = 3;
	public static void main(String args[])
	{
		Demo d = new Demo();
		d.x = 9;
		show(d);
		syso(d.x);
	}
	public static void show(Demo d)
	{
		d.x = 4;
	}
}
//x=4

上面俩注意画堆内存和栈内存图。
*/

/*
封装
//隐藏类中的实现细节，对外提供公共的访问方法。
//安全性，复用性，将变化隔离，便于使用，隐藏细节。凡是对象都具备。
//封装原则：将不需要对外提供的内容都隐藏起来
                          把属性都隐藏，提供公共方法对其访问。
//private:私有。权限修饰符。用于修饰成员。私有的内容只在本类中有效。

//注意：私有仅仅是封装的一种体现而已。还有其他方法。只要隐藏起来，让外界访问不到就行。
//函数，类，框架都是封装体。
class Person
{
	//在一个类中定义成员变量，一般都是私有的。成员变量对应两个方法set&get，setXxx&getXxx，
	  set通常void，get返回类型跟属性类型相同。
	private int age;	//private 私有。防止随便访问，赋值一些不允许的值，产生安全隐患。只在本类中有效。
	//在方法中对给定的数据进行逻辑判断。安全，对属性就行可控。
	public void setAge(int a)	//赋值操作
	{
		if(a > 0 && a < 200)	
			age = a;
		else 
			System.out.println("error");
	}
	public int getAge(int a)	//获取操作
	{
		return age;
	}
	void speak()
	{
		System.out.println("age = "+age);
	}
}
public class javaTest {	
	public static void main(String[] args)
	{
		Person p = new Person();
		p.setAge(-20);
		p.speak();
	}
}
 */


/*
继承
class A extends B  A子类，B父类
好处：
1.提高了代码的复用性
2.让类与类之间产生关系，给多态提供了前提。

java中支持单继承，不直接支持多继承，但对c++中的多继承机制进行改良。
单继承：一个子类只能有一个直接父类。
多继承：一个子类可以有多个直接父类。（java中不允许，因为多个父类中有相同成员，会产生调用的不确定性，进行改良）
	    在java中是通过“多实现”的方式来体现
java支持多层继承（多重）
就会出现继承体系。
当要使用一个集成体系时，
1.查看该体系中的顶层类，了解该体系的基本功能
2.创建体系中的最子类对象，完成功能的是用

什么时候定义继承
当类与类之间存在着所属关系的时候，就定义继承，xxx是yyy中的一种，xxx extends yyy

在子父类中，成员的特点体现：
1.成员变量
	当子父类中的成员变量重名，用super区分父类
	this代表一个本类对象的引用
	super代表一个父类空间
2.成员函数
3.构造函数

*/

/*
构造函数
特点：1.函数名与类名相同
	2.不用定义返回值类型 
	3.没有具体的返回值
作用：给对象就行初始化
注意：1.默认构造函数的特点
	2.多个构造函数是以重载的形式存在的

class Person
{
	private String name;
	private int age;
	//定义一个Person类的构造函数
	Person()	//空参数的构造函数      new对象时，就会调用这个函数，可以给对象进行初始化
				//创建的对象都需要构造函数进行初始化.
				//一个类中，如果没有定义过构造函数，那么该类中会有一个默认的空参数构造函数 Person(){}
				//如果在类中定义了指定的构造函数，那么类中的默认构造函数就没有了。
	{
		System.out.println("person run");	
	}
	public void speak()
	{
		System.out.println(name+"..."+age);
	}
}

//一般函数和构造函数的区别
1.构造函数对象创建时，就会调用与之对应的构造函数对对象进行初始化
     一般函数对象创建后，需要该函数功能时才调用。
2.构造函数对象创建时，会调用，只调用一次
     一般函数对象创建后，可以被调用多次

//什么时候定义构造函数
 * 在描述事物时，该事物一存在就具备的一些内容，这些内容都定义在构造函数中。

修改对象中成员变量set
构造函数可以调用一般函数。一般函数不能调用构造函数，如果要调用的话，就得在一般函数里创建一个新的对象。
一般函数首字母小写，构造函数首字母大写。
定义过构造函数，默认的构造函数就没有了。
构造函数里有默认的return语句。
*/

/*
this关键字
1.当成员变量和局部变量重名，可以用关键字this来区分。this代表当前对象。
  this就是所在‘函’数所属‘对象’的引用。简单说：哪个对象调用了this所在的函数，this就代表哪个对象。
Person(String name,int age)  //提高代码的阅读性，改成name，age。导致局部变量和成员变量重名。
	{
		this.name = name;		//this表示这个对象的name，堆内存的。
		this.age = age;
	}

2.用于在构造函数中，调用其他构造函数，只能定义在构造函数的第一行。因为初始化动作要先执行。     
Person(String name,int age)  
	{
		this(name);		//找一个带字符串参数的构造函数。提高代码复用性。内存中因为this调用，又进来一个函数。
						//必须放在构造函数的第一行。
		this.age = age;
	}
	Person(String name)
	{
		this.name = name;
	}
3.互相调用的时候，避免死循环。栈溢出。
4.在本类中调用本类的对象，通常都用this
public boolean campare(Person p)
{
	if(this.age == p.age)
		return true;
	else
		return false;
}
 */

/*
static
用于修饰成员（成员变量和成员函数）。静态变量，类变量。 //String name;实例变量，成员变量

被修饰后的成员具备以下特点：
1.随着类的加载而加载
2.优先于对象存在，因为static的成员随着类的加载就已经存在的
3.被所有对象所共享
4.可以直接被类名调用，类名.静态成员

注意：
1.静态方法只能访问静态变量，非静态既可以访问静态，又可以访问非静态(静态先存在，后面可以访问前面，前面不可以访问后面)
2.静态方法中不可以使用this，super关键字(没有对象)
3.主函数是静态的(主函数调用其他非静态变量可以定义一个对象 new 对象.方法)
4.静态变量前省略的是类名，非静态变量省略的是this

关于主函数
public static void main(String[] args)
1.主函数是固定的
2.被jvm所识别和调用

public：因为权限必须是最大的。
static：调用时是不需要对象的，直接用主函数所属类名调用即可。
void:主函数没有具体的返回值。
main：函数名，不是关键字，只是一个jvm识别的一个固定的名字。
String args[]这是主函数的参数列表，是一个数组类型的参数，而且元素都是字符串类型。
System.out.println(args); //[Ljava.lang.String;@15db9742
说明jvm调用主函数的时候，给main方法传递一个字符串类型的数组实体。
System.out.println(args.length);//0    new String[0]
cmd： java Test a b c   args[3]={"a","b","c"};
args形式参数，随便改(arguments)，唯一一个可以改的地方。

成员变量和静态变量的区别
1.两个变量的生命周期不同。
      成员变量随着对象的创建而存在，对象的被回收而释放。占用空间大
       静态变量随着类的加载而加载，随着累的消失而消失 （虚拟机结束，类消失，类本身就是一个对象。垃圾回收机制）生命周期太长
2.调用方式不同。
       成员变量只能被对象调用
       静态变量可以被对象调用，还可以用类名调用
3.别名不同
       成员变量也成为实例变量
       静态变量成为类变量
4.数据的存储位置不同
        成员变量数据存储在堆内存的对象中，所以也叫对象的特有数据
        静态变量数据存储在方法区（中的静态区中）也叫共享数据区，所以也叫对象的共享数据 
        
什么时候用static
1.静态变量
      当分析对象中所具备的成员变量的值都是相同的，这时这个成员就可以被静态修饰。
      只要数据在对象中都是不同的，就是对象的特有数据，必须存储在对象中，是非静态的。
      如果是相同的数据，对象不需要做修改，只需要使用即可，不需要存储在对象中，对空间有效利用，定义成静态的。
2.静态函数
      该函数功能是否有访问到对象中的特有数据。
      从源代码看，该功能是否需要访问非静态的成员变量。
      如果需要，该功能就是非静态的。
      如果不需要，就可以将该功能定义成静态的，当然，也可以定义成非静态的，但是非静态需要被对象调用，而仅创建对象调用非静态的没有访问特有数据的方法，该对象的创建就是没意义的

静态代码块
用于给类进行初始化，随着类的加载而进行初始化。一般全是静态成员。
调用 StaticCode.show();
class StaticCode
{
	static				//没名字。满足静态的一切特点，随着类的加载而执行。只执行一次。
	{
		syso("dddd");
	}
	void show()
	{
		syso("d");
	}
}

构造代码块   
class StaticCode
{
	{
		syso("dddd");  //创建几个对象，运行几次，给所有对象进行初始化
	}
	void show()
	{
		syso("d");
	}
}
构造函数是给对象进行针对性的初始化。构造代码块给所有对象

静态代码块。如果有对象构造代码块先执行，没有构造函数
*/

class Person  	                                        
{
	String name;
	int age;
}
class Student extends Person
{
	//String name;
	//int age; 
	void study()
	{
		System.out.println(name+age+"study");
	}
}
class Worker extends Person
{
	//String name;
	//int age;
	void work()
	{
		System.out.println(name+age+"work");
	}
}
public class javaTest {	
	public static void main(String[] args)
	{
		Student s = new Student();
		s.name = "abc";
		s.age = 40;
		s.study();
	}
}
