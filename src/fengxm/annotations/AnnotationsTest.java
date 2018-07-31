/**
 * 
 */
package fengxm.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(METHOD)
/**
 * @author fengxm
 * @Documented 一个简单的Annotations标记注解，表示是否将注解信息添加在java文档中
 * @Retention– 定义该注解的生命周期。
 * 	RetentionPolicy.SOURCE – 在编译阶段丢弃。这些注解在编译结束之后就不再有任何意义，所以它们不会写入字节码。@Override, @SuppressWarnings都属于这类注解。
 * 	RetentionPolicy.CLASS – 在类加载的时候丢弃。在字节码文件的处理中有用。注解默认使用这种方式。
 * 	RetentionPolicy.RUNTIME– 始终不会丢弃，运行期也保留该注解，因此可以使用反射机制读取该注解的信息。我们自定义的注解通常使用这种方式。
 * @Target – 表示该注解用于什么地方。如果不明确指出，该注解可以放在任何地方。以下是一些可用的参数。需要说明的是：属性的注解是兼容的，如果你想给7个属性都添加注解，仅仅排除一个属性，那么你需要在定义target包含所有的属性。
 * 	ElementType.TYPE:用于描述类、接口或enum声明
 * 	ElementType.FIELD:用于描述实例变量
 * 	ElementType.METHOD
 * 	ElementType.PARAMETER
 * 	ElementType.CONSTRUCTOR
 * 	ElementType.LOCAL_VARIABLE
 * 	ElementType.ANNOTATION_TYPE 另一个注释
 * 	ElementType.PACKAGE 用于记录java文件的package信息
 * @Inherited – 定义该注释和子类的关系
 * Refer: https://blog.csdn.net/u014563989/article/details/60570794
 * MyBlog: http://www.cnblogs.com/fengxm
 * 
 */
public @interface AnnotationsTest {
	public enum Priority {LOW, MEDIUM, HIGH}
	public enum Status {STARTED, NOT_STARTED}
	String author() default "Fengxm";
	Priority priority() default Priority.LOW;
	Status status() default Status.NOT_STARTED;
}
