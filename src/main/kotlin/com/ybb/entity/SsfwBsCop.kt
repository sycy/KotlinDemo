package com.ybb.entity

import org.hibernate.annotations.Formula
import java.sql.Date
import javax.persistence.*

@Entity
@Table(name = "t_ssfw_bs")
data class SsfwBsCop(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var uuid: String? = null,
    var nsrsbh: String? = null


//    ,
//    var sx: String? = null,
//    var cjsj: Date? = null,
//    @Transient
//    var request : String = "",
//    @Transient
//    var response : String = "",
//    var zt : String? = null,
//    var errorcode : String? = null
)