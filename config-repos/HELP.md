#仓库中的配置文件会被转换成web接口，访问可以参照以下的规则：
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties

*client会根据填写的参数来选择读取对应的配置*