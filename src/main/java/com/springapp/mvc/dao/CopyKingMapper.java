package com.springapp.mvc.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * Created by baeonejune on 2015. 11. 9..
 */
public interface CopyKingMapper {
    @Select("SELECT product_id, product_name, product_url, thumb_url, spec1, spec2, seed_url, category FROM product_main limit 20")
    List<Map<String, Object>> selectMainDataAll();

    @Select("SELECT post_image_url, post_title, post_desc, post_author, post_url  FROM blog_ext_body_data WHERE product_id=#{productId} limit 5")
    List<Map<String, Object>> selectBlogList(@Param("productId") String productId);




    @Insert("INSERT INTO document (dsid, operation_user, created_at) VALUES (#{dsid}, #{operation_user}, now())")
    int insertDocument(@Param("dsid") String dsid, @Param("operation_user") String operationUser);

    @Select("SELECT dsid, created_at FROM document WHERE dsid = #{dsid}")
    Map<String, Object> selectDocumentByDsid(@Param("dsid") String dsid);

    @Insert("INSERT INTO thumbnail (dsid, imghash, status, operation_user, description, created_at) VALUES (#{dsid}, #{imghash}, #{status}, #{operation_user}, #{description}, now())")
    int insertThumbnail(@Param("dsid") String dsid,
                        @Param("imghash") String imghash,
                        @Param("status") String status,
                        @Param("operation_user") String operationUser,
                        @Param("description") String description);

    @Update("UPDATE thumbnail SET status = #{status}, operation_user = #{operation_user}, description = #{description} WHERE dsid = #{dsid} AND imghash = #{imghash}")
    int updateThumbnail(@Param("status") String status,
                        @Param("operation_user") String operationUser,
                        @Param("description") String description,
                        @Param("dsid") String dsid,
                        @Param("imghash") String imghash);


    @Select("SELECT dsid, imghash, status, operation_user, description, updated_at, created_at FROM thumbnail WHERE dsid = #{dsid}")
    List<Map<String, Object>> selectThumbnailsByDsid(@Param("dsid") String dsid);

    @Select("SELECT dsid, imghash, status, operation_user, description, updated_at, created_at FROM thumbnail WHERE dsid = #{dsid} AND status = #{status}")
    List<Map<String, Object>> selectThumbnailsByDsidAndStatus(@Param("dsid") String dsid,
                                                              @Param("status") String status);

    @Select("SELECT dsid, imghash, status, operation_user, description, updated_at, created_at FROM thumbnail WHERE dsid = #{dsid} AND imghash = #{imghash} LIMIT 1")
    Map<String, Object> selectThumbnailByDsidAndImghash(@Param("dsid") String dsid,
                                                        @Param("imghash") String imghash);

    @Insert("INSERT INTO history (dsid, imghash, status, operation_user, description, created_at) VALUES (#{dsid}, #{imghash}, #{status}, #{operation_user}, #{description}, now())")
    int insertHistory(@Param("dsid") String dsid,
                      @Param("imghash") String imghash,
                      @Param("status") String status,
                      @Param("operation_user") String operationUser,
                      @Param("description") String description);

    @Select("SELECT dsid, imghash, status, operation_user, description, created_at FROM history ORDER BY id DESC")
    List<Map<String, Object>> selectHistories();

    @Select("SELECT dsid, imghash, status, operation_user, description, created_at FROM history WHERE ${where} ORDER BY id DESC")
    List<Map<String, Object>> selectHistoriesWhere(@Param("where") String where);

    @Select("SELECT dsid, imghash, status, operation_user, description, created_at FROM history WHERE dsid = #{dsid} ORDER BY id DESC")
    List<Map<String, Object>> selectHistoriesByDsid(@Param("dsid") String dsid);

    @Select("SELECT dsid, imghash, status, operation_user, description, created_at FROM history WHERE dsid = #{dsid} AND imghash = #{imghash} ORDER BY id DESC")
    List<Map<String, Object>> selectHistoriesByDsidAndImghash(@Param("dsid") String dsid,
                                                              @Param("imghash") String imghash);

    @Select("SELECT dsid, imghash, status, operation_user, description, created_at FROM history WHERE operation_user = #{operation_user} ORDER BY id DESC")
    List<Map<String, Object>> selectHistoriesByOperationUser(@Param("operation_user") String operationUser);
}
