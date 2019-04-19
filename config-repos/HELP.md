# **仓库中的配置文件会被转换成web接口，访问可以参照以下的规则：** 


>- /{application}/{profile}[/{label}]<br/>
>- /{application}-{profile}.yml<br/>
>- /{label}/{application}-{profile}.yml<br/>
>- /{application}-{profile}.properties<br/>
>- /{label}/{application}-{profile}.properties<br/>
---
*client会根据填写的参数来选择读取对应的配置*