package com.abin.lee.aviator.test.multipath;

import com.jayway.jsonpath.JsonPath;
import org.apache.dubbo.common.utils.JsonUtils;
import org.junit.Test;

/**
 * JSONPath - 用于JSON的XPath，用来解析多层嵌套的json数据;是一种信息抽取类库，是从JSON文档中抽取指定信息的工具.
 * JsonPath有许多编程语言，如Javascript、Python、PHP、Java等
 * JsonPath提供的json解析非常强大，它提供了类似正则表达式的语法，基本上可以满足所有你想要获得的json内容。
 * Java(27):Java JsonPath 解析JSON数据
 * https://blog.csdn.net/fen_fen/article/details/120442736
 */
public class JsonPathTest {


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
    public void test1(){
        String json = "{\"code\":0,\"data\":{\"totalCount\":7,\"pageSize\":10,\"totalPage\":1,\"currPage\":1,\"list\":[{\"roleId\":\"1440544989116395521\",\"roleName\":\"rolename86918033\",\"roleDescribe\":\"角色描述\",\"createTime\":1632287664000,\"permissionList\":null,\"permissionIdList\":null},{\"roleId\":\"admin\",\"roleName\":\"管理员角色\",\"roleDescribe\":\"系统内置角色\",\"createTime\":1588231288000,\"permissionList\":null,\"permissionIdList\":null},{\"roleId\":\"auditor\",\"roleName\":\"审计员角色\",\"roleDescribe\":\"系统内置角色\",\"createTime\":1588231217000,\"permissionList\":null,\"permissionIdList\":null}]}}";
        String roleId1 = JsonPath.read(json, "$.data.list[0].roleId");
        System.out.println("roleId1="+roleId1);
        String roleId2 = JsonPath.read(json, "$.data.list[1].roleId");
        System.out.println("roleId2="+roleId2);
        String roleId3 = JsonPath.read(json, "$.data.list[2].roleId");
        System.out.println("roleId3="+roleId3);

        Object totalCount = JsonPath.read(json, "$.data.totalCount");
        System.out.println("totalCount="+totalCount);

        String roleName1 = JsonPath.read(json, "$.data.list[0].roleName");
        System.out.println("roleName1="+roleName1);
        String roleName2 = JsonPath.read(json, "$.data.list[1].roleName");
        System.out.println("roleName2="+roleName2);
        String roleName3 = JsonPath.read(json, "$.data.list[2].roleName");
        System.out.println("roleName3="+roleName3);

        Object list = JsonPath.read(json, "$.data.list");
        System.out.println("list1="+list);
        System.out.println("list2="+ JsonUtils.toJson(list));

    }






}
