# springdemo
Spring core have two important function:
injection dependencies/inversion of control(DI/IOC)
Aspect oriented programming(AOP)


DI
Programer descript the actual classes and services they want and give meta data 
(configuration file) to spring, then spring wires all these together and managed the lifecycle of the instances.
We don't need to initiate the instance and to plug them in, spring do the control of it. 


Spring container
	https://www.safaribooksonline.com/library/view/spring-in-action/9781617291203/01fig04.jpg


There is 3 kinds of configuration in Spring
	Explicit configuration in XML
	Explicit configuration in Java
	Implicit bean discovery and automatic wiring


About Dependencies injection 
	with explicit configuration
		call a setter method 
		using a constructor argument
	with implicit configuration
		you can even use the class member variables
		or anyother method 
			public void injectXXX(<T> target){
				this.youTarget=target;
			}


Required Jar file
See demo_xml

introduce the demo structure and the implementation without spring
demo_xml
demo_javaconfig
demo


When you have multiple classes implements one interface, and you just define the member with interface type, spring don't know which class you want to create a instance.
You can tell spring by the following three method.
1. define the member as the lower case of the target class
eg. @Autowired 
	private Weapon gun;

2.add Qualifier annotation after Autowired
eg. @Autowired @Qualifier(value="gun") 
	private Weapon w1;

3.use Resource annotation instead of @Autowired
eg. @Resource(value = "gun")
	private Weapon w1;

4.define the member as a collection, and get the target class by index.
eg. @Autowired
	private List<Weapon> wps;
	


To prove that spring managed the bean lifecycle we can add a postconstruct and a predestroy method in DemselRescuingKnight.
So when we run the application. You will see the postInit method is called in the applciation context prepare refreshing.
But the predestroy method won't be called, because the application context is not closed in my main method. So you can add a close to close the application context or a registerShutDownHook method to close the application context within the JVM shutdown.



AOP
https://www.safaribooksonline.com/library/view/spring-in-action/9781617291203/04fig01.jpg
Aop: aspect oriented programming
Aspect is just like a blanket, the blanket go across all the bean method execution.
The blanket with function will cover any method you defined.
For example, you want to log for set method of all beans, as usual, you need to create a logger member for every class you want to log. But with spring aop, you just need to define what where and when in the aspect class. Then spring will run the aspect logic for you.



In Spring, aspects are woven into Spring-managed beans at runtime by wrapping them with a proxy class. 
https://www.safaribooksonline.com/library/view/spring-in-action/9781617291203/04fig03.jpg
Your call will arrived the proxy first then go to the target object, then will get back to the proxy , at last go back to your caller, it means that you can define the advice in both in process and out process.


To use AOP
1.add jars (add dependencies in pom file)
spring-aop
aopalliance
aspectjweaver

2.add @EnableAspectJAutoProxy(proxyTargetClass = true) annotation to the application configuration class file to enable the spring aspect.
We need to add (proxyTargetClass = true) attribute, to tell spring that we want to generate the aspect proxy use CGLIB Proxy(will create proxy bean for class) not JDK Proxy(will create proxy bean for interface)
If we don't do that, there will be an error of NoSuchBeanDefinitionException.
If use JDK proxy for demo, you need to use 
Knight knight = ctx.getBean(Knight.class); 
not
Knight knight = ctx.getBean(DemselRescuingKnight.class); 
in App.java, because proxy bean implements Knight, you can't get a proxy bean implements DemselRescuingKnight.
But use CGLIB , spring generate the proxy bean of DemselRescuingKnight



AOP terminology
advice: defined what and when of the aspect
pointcuts : Just like a filter, to find the public method you want to weave you aspect, define where of the aspect 
(Spring only supports public method join points)
join points: target the public method you can weave your aspect














