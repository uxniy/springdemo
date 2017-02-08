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


AOP
https://www.safaribooksonline.com/library/view/spring-in-action/9781617291203/04fig01.jpg

AOP terminology
advice: defined what and when of the aspect
pointcuts : the public method you weave you aspect, define where of the aspect 
(Spring only supports public method join points)
join points: the public method you can weav your aspect
https://www.safaribooksonline.com/library/view/spring-in-action/9781617291203/04fig02.jpg


In Spring, aspects are woven into Spring-managed beans at runtime by wrapping them with a proxy class. 
https://www.safaribooksonline.com/library/view/spring-in-action/9781617291203/04fig03.jpg
Your call will arrived the proxy first then go to the target object, then will get back to the proxy , at last go back to your caller, it means that you can define the advice in both in process and out process.






