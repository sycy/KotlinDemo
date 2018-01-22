package com.ybb.dao

import com.ybb.entity.SsfwBs
import com.ybb.entity.SsfwBsExtend
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface SsfwBsDao : JpaRepository<SsfwBs, String>, JpaSpecificationExecutor<SsfwBs> {
    fun findBySx(sx: String): List<SsfwBs>
    @Query("select new com.ybb.entity.SsfwBsExtend(uuid,nsrsbh) from SsfwBs bs where bs.sx = ?1", nativeQuery = false)
    fun queryBySx(sx: String): List<SsfwBsExtend>
}