package com.abin.lee.aviator.test.multipath;

import com.abin.lee.aviator.util.JsonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;

public class JacksonPathTest {

    /**
     * {
     *     "code": 0,
     *     "data": {
     *         "totalCount": 7,
     *         "pageSize": 10,
     *         "totalPage": 1,
     *         "currPage": 1,
     *         "list": [
     *             {
     *                 "roleId": "1440544989116395521",
     *                 "roleName": "rolename86918033",
     *                 "roleDescribe": "角色描述",
     *                 "createTime": 1632287664000,
     *                 "permissionList": null,
     *                 "permissionIdList": null
     *             },
     *             {
     *                 "roleId": "admin",
     *                 "roleName": "管理员角色",
     *                 "roleDescribe": "系统内置角色",
     *                 "createTime": 1588231288000,
     *                 "permissionList": null,
     *                 "permissionIdList": null
     *             },
     *             {
     *                 "roleId": "auditor",
     *                 "roleName": "审计员角色",
     *                 "roleDescribe": "系统内置角色",
     *                 "createTime": 1588231217000,
     *                 "permissionList": null,
     *                 "permissionIdList": null
     *             }
     *         ]
     *     }
     * }
     */
    @Test
    public void test1() throws JsonProcessingException {
        String json = "{\"code\":0,\"data\":{\"totalCount\":7,\"pageSize\":10,\"totalPage\":1,\"currPage\":1,\"list\":[{\"roleId\":\"1440544989116395521\",\"roleName\":\"rolename86918033\",\"roleDescribe\":\"角色描述\",\"createTime\":1632287664000,\"permissionList\":null,\"permissionIdList\":null},{\"roleId\":\"admin\",\"roleName\":\"管理员角色\",\"roleDescribe\":\"系统内置角色\",\"createTime\":1588231288000,\"permissionList\":null,\"permissionIdList\":null},{\"roleId\":\"auditor\",\"roleName\":\"审计员角色\",\"roleDescribe\":\"系统内置角色\",\"createTime\":1588231217000,\"permissionList\":null,\"permissionIdList\":null}]}}";
//        JsonNode jsonNode = objectMapper.readTree(json);
//        System.out.println("jsonNode="+jsonNode.findPath());
//        System.out.println("data="+jsonNode.path("/data"));
//        System.out.println("code.totalCount="+jsonNode.findPath("data.totalCount"));
//        System.out.println("code.list="+jsonNode.path("data.list"));
    }





}
