//package com.hchl;
//
//import io.swagger.annotations.ApiModelProperty;
//
//import java.io.Serializable;
//
///**
// * 类 编 号：
// * 类 名 称：
// * 内容摘要：
// * 创建日期：2017/10/23
// * 编码作者：hcl
// * @author huangchenliang
// */
//public class SonarUrl implements Serializable
//{
//    private static final long serialVersionUID = 1L;
//    @ApiModelProperty(value="主键", hidden=false, notes="主键，隐藏", required=true, dataType="Long")// 使用该注解描述属性信息,当hidden=true时，该属性不会在api中显示
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @ApiModelProperty(value="URL链接地址")
//    @Column(name="URL")
//    private String url;
//
//    @ApiModelProperty(value="项目组")
//    @Column(name="TEAM")
//    private String team;
//
//    @ApiModelProperty(value="部门")
//    @Column(name="DEPARTMENT")
//    private String department;
//
//}
