package com.dongnao.jack.bean;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "t_car_brand")
public class Brand   {

    private Long id;

    /**
     * 品牌id
     */
    @Column(name = "brand_id")
    private Integer brandId;

    /**
     * 品牌名
     */
    @Column(name = "brand_name")
    private String brandName;

    /**
     * 别名
     */
    @Column(name = "brand_alias")
    private String brandAlias;

    /**
     * 图片
     */
    private String picture;

    /**
     * 首字母
     */
    private String letter;

    /**
     * 排序
     */
    private Integer rank;

    /**
     *  状态 1：显示，2：隐藏，0：删除'
     */
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取品牌id
     *
     * @return brand_id - 品牌id
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * 设置品牌id
     *
     * @param brandId 品牌id
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * 获取品牌名
     *
     * @return brand_name - 品牌名
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 设置品牌名
     *
     * @param brandName 品牌名
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    /**
     * 获取别名
     *
     * @return brand_alias - 别名
     */
    public String getBrandAlias() {
        return brandAlias;
    }

    /**
     * 设置别名
     *
     * @param brandAlias 别名
     */
    public void setBrandAlias(String brandAlias) {
        this.brandAlias = brandAlias == null ? null : brandAlias.trim();
    }

    /**
     * 获取图片
     *
     * @return picture - 图片
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置图片
     *
     * @param picture 图片
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    /**
     * 获取首字母
     *
     * @return letter - 首字母
     */
    public String getLetter() {
        return letter;
    }

    /**
     * 设置首字母
     *
     * @param letter 首字母
     */
    public void setLetter(String letter) {
        this.letter = letter == null ? null : letter.trim();
    }

    /**
     * 获取排序
     *
     * @return rank - 排序
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * 设置排序
     *
     * @param rank 排序
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * 获取 状态 1：显示，2：隐藏，0：删除'
     *
     * @return status -  状态 1：显示，2：隐藏，0：删除'
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态 1：显示，2：隐藏，0：删除'
     *
     * @param status  状态 1：显示，2：隐藏，0：删除'
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}