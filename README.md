# feign-jar-import-demo
<h2>spring cloud 调用jar包中feign接口调用远程服务</h2>
<h3>说明：</h3>
<p>1.producer（生产者）</p>
  
<p>在producer中声明接口及实现类，该接口使用FeignClient注解，并使用maven-jar-plugin插件将接口单独打包出来供消费者使用。</p>
<p>2.consumer（消费者）</p>
<p>在consumer的pom中直接依赖producer提供的接口jar包，便直接可以使用producer提供的服务，或者也可以自己写FeignClient接口，注意规范即可。</p>

