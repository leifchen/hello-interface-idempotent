# hello-interface-idempotent

基于 Redis + Token 实现 API 接口的幂等性校验。

**工作原理**

创建一个唯一标识 token 并存入 redis，当请求接口时，将此 token 放到 header 或者作为请求参数请求接口，后端接口判断 redis 中是否存在此 token：
* 如果存在，正常处理业务逻辑，并从 redis 中删除此 token，那么如果是重复请求，由于 token 已被删除，则不能通过校验，返回请勿重复操作提示
* 如果不存在，说明参数不合法或者是重复请求，返回提示即可
