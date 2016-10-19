# springmvc-quartz
- 启动之后每五秒输出一个working
- 使用MethodInvokingJobDetailFactoryBean可以不实现Job接口,配置任务调度方法
- trigger里面设置执行的时间，使用CronTrigger可以使用表达式配置调度方法，表达式语法参见http://www.blogjava.net/xmatthew/archive/2009/02/15/253864.html
- simpleTrigger适合定时启动，重复执行若干次的任务，关于simpleTrigger配置
- \<bean id="simpleTrigger" class="org.springframework.scheduling.quartz.SimpleTriggerBean"\>  
-        \<property name="jobDetail" ref="myJob" /\>
-        <!--启动延迟-->
-        \<property name="startDelay" value="0" /\> 
        <!--重复次数-->
-        \<property name="repeatInterval" value="10000" /\>  
- \</bean\>  
