package com.ncuedu.bookshopserver.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookTitleIsNull() {
            addCriterion("book_title is null");
            return (Criteria) this;
        }

        public Criteria andBookTitleIsNotNull() {
            addCriterion("book_title is not null");
            return (Criteria) this;
        }

        public Criteria andBookTitleEqualTo(String value) {
            addCriterion("book_title =", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleNotEqualTo(String value) {
            addCriterion("book_title <>", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleGreaterThan(String value) {
            addCriterion("book_title >", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleGreaterThanOrEqualTo(String value) {
            addCriterion("book_title >=", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleLessThan(String value) {
            addCriterion("book_title <", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleLessThanOrEqualTo(String value) {
            addCriterion("book_title <=", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleLike(String value) {
            addCriterion("book_title like", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleNotLike(String value) {
            addCriterion("book_title not like", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleIn(List<String> values) {
            addCriterion("book_title in", values, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleNotIn(List<String> values) {
            addCriterion("book_title not in", values, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleBetween(String value1, String value2) {
            addCriterion("book_title between", value1, value2, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleNotBetween(String value1, String value2) {
            addCriterion("book_title not between", value1, value2, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookStockIsNull() {
            addCriterion("book_stock is null");
            return (Criteria) this;
        }

        public Criteria andBookStockIsNotNull() {
            addCriterion("book_stock is not null");
            return (Criteria) this;
        }

        public Criteria andBookStockEqualTo(Integer value) {
            addCriterion("book_stock =", value, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockNotEqualTo(Integer value) {
            addCriterion("book_stock <>", value, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockGreaterThan(Integer value) {
            addCriterion("book_stock >", value, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_stock >=", value, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockLessThan(Integer value) {
            addCriterion("book_stock <", value, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockLessThanOrEqualTo(Integer value) {
            addCriterion("book_stock <=", value, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockIn(List<Integer> values) {
            addCriterion("book_stock in", values, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockNotIn(List<Integer> values) {
            addCriterion("book_stock not in", values, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockBetween(Integer value1, Integer value2) {
            addCriterion("book_stock between", value1, value2, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockNotBetween(Integer value1, Integer value2) {
            addCriterion("book_stock not between", value1, value2, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookOrderpriceIsNull() {
            addCriterion("book_orderprice is null");
            return (Criteria) this;
        }

        public Criteria andBookOrderpriceIsNotNull() {
            addCriterion("book_orderprice is not null");
            return (Criteria) this;
        }

        public Criteria andBookOrderpriceEqualTo(BigDecimal value) {
            addCriterion("book_orderprice =", value, "bookOrderprice");
            return (Criteria) this;
        }

        public Criteria andBookOrderpriceNotEqualTo(BigDecimal value) {
            addCriterion("book_orderprice <>", value, "bookOrderprice");
            return (Criteria) this;
        }

        public Criteria andBookOrderpriceGreaterThan(BigDecimal value) {
            addCriterion("book_orderprice >", value, "bookOrderprice");
            return (Criteria) this;
        }

        public Criteria andBookOrderpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("book_orderprice >=", value, "bookOrderprice");
            return (Criteria) this;
        }

        public Criteria andBookOrderpriceLessThan(BigDecimal value) {
            addCriterion("book_orderprice <", value, "bookOrderprice");
            return (Criteria) this;
        }

        public Criteria andBookOrderpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("book_orderprice <=", value, "bookOrderprice");
            return (Criteria) this;
        }

        public Criteria andBookOrderpriceIn(List<BigDecimal> values) {
            addCriterion("book_orderprice in", values, "bookOrderprice");
            return (Criteria) this;
        }

        public Criteria andBookOrderpriceNotIn(List<BigDecimal> values) {
            addCriterion("book_orderprice not in", values, "bookOrderprice");
            return (Criteria) this;
        }

        public Criteria andBookOrderpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_orderprice between", value1, value2, "bookOrderprice");
            return (Criteria) this;
        }

        public Criteria andBookOrderpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_orderprice not between", value1, value2, "bookOrderprice");
            return (Criteria) this;
        }

        public Criteria andBookSalepriceIsNull() {
            addCriterion("book_saleprice is null");
            return (Criteria) this;
        }

        public Criteria andBookSalepriceIsNotNull() {
            addCriterion("book_saleprice is not null");
            return (Criteria) this;
        }

        public Criteria andBookSalepriceEqualTo(BigDecimal value) {
            addCriterion("book_saleprice =", value, "bookSaleprice");
            return (Criteria) this;
        }

        public Criteria andBookSalepriceNotEqualTo(BigDecimal value) {
            addCriterion("book_saleprice <>", value, "bookSaleprice");
            return (Criteria) this;
        }

        public Criteria andBookSalepriceGreaterThan(BigDecimal value) {
            addCriterion("book_saleprice >", value, "bookSaleprice");
            return (Criteria) this;
        }

        public Criteria andBookSalepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("book_saleprice >=", value, "bookSaleprice");
            return (Criteria) this;
        }

        public Criteria andBookSalepriceLessThan(BigDecimal value) {
            addCriterion("book_saleprice <", value, "bookSaleprice");
            return (Criteria) this;
        }

        public Criteria andBookSalepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("book_saleprice <=", value, "bookSaleprice");
            return (Criteria) this;
        }

        public Criteria andBookSalepriceIn(List<BigDecimal> values) {
            addCriterion("book_saleprice in", values, "bookSaleprice");
            return (Criteria) this;
        }

        public Criteria andBookSalepriceNotIn(List<BigDecimal> values) {
            addCriterion("book_saleprice not in", values, "bookSaleprice");
            return (Criteria) this;
        }

        public Criteria andBookSalepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_saleprice between", value1, value2, "bookSaleprice");
            return (Criteria) this;
        }

        public Criteria andBookSalepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_saleprice not between", value1, value2, "bookSaleprice");
            return (Criteria) this;
        }

        public Criteria andBookSalevolumeIsNull() {
            addCriterion("book_salevolume is null");
            return (Criteria) this;
        }

        public Criteria andBookSalevolumeIsNotNull() {
            addCriterion("book_salevolume is not null");
            return (Criteria) this;
        }

        public Criteria andBookSalevolumeEqualTo(Integer value) {
            addCriterion("book_salevolume =", value, "bookSalevolume");
            return (Criteria) this;
        }

        public Criteria andBookSalevolumeNotEqualTo(Integer value) {
            addCriterion("book_salevolume <>", value, "bookSalevolume");
            return (Criteria) this;
        }

        public Criteria andBookSalevolumeGreaterThan(Integer value) {
            addCriterion("book_salevolume >", value, "bookSalevolume");
            return (Criteria) this;
        }

        public Criteria andBookSalevolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_salevolume >=", value, "bookSalevolume");
            return (Criteria) this;
        }

        public Criteria andBookSalevolumeLessThan(Integer value) {
            addCriterion("book_salevolume <", value, "bookSalevolume");
            return (Criteria) this;
        }

        public Criteria andBookSalevolumeLessThanOrEqualTo(Integer value) {
            addCriterion("book_salevolume <=", value, "bookSalevolume");
            return (Criteria) this;
        }

        public Criteria andBookSalevolumeIn(List<Integer> values) {
            addCriterion("book_salevolume in", values, "bookSalevolume");
            return (Criteria) this;
        }

        public Criteria andBookSalevolumeNotIn(List<Integer> values) {
            addCriterion("book_salevolume not in", values, "bookSalevolume");
            return (Criteria) this;
        }

        public Criteria andBookSalevolumeBetween(Integer value1, Integer value2) {
            addCriterion("book_salevolume between", value1, value2, "bookSalevolume");
            return (Criteria) this;
        }

        public Criteria andBookSalevolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("book_salevolume not between", value1, value2, "bookSalevolume");
            return (Criteria) this;
        }

        public Criteria andBookShelftimeIsNull() {
            addCriterion("book_shelftime is null");
            return (Criteria) this;
        }

        public Criteria andBookShelftimeIsNotNull() {
            addCriterion("book_shelftime is not null");
            return (Criteria) this;
        }

        public Criteria andBookShelftimeEqualTo(Date value) {
            addCriterion("book_shelftime =", value, "bookShelftime");
            return (Criteria) this;
        }

        public Criteria andBookShelftimeNotEqualTo(Date value) {
            addCriterion("book_shelftime <>", value, "bookShelftime");
            return (Criteria) this;
        }

        public Criteria andBookShelftimeGreaterThan(Date value) {
            addCriterion("book_shelftime >", value, "bookShelftime");
            return (Criteria) this;
        }

        public Criteria andBookShelftimeGreaterThanOrEqualTo(Date value) {
            addCriterion("book_shelftime >=", value, "bookShelftime");
            return (Criteria) this;
        }

        public Criteria andBookShelftimeLessThan(Date value) {
            addCriterion("book_shelftime <", value, "bookShelftime");
            return (Criteria) this;
        }

        public Criteria andBookShelftimeLessThanOrEqualTo(Date value) {
            addCriterion("book_shelftime <=", value, "bookShelftime");
            return (Criteria) this;
        }

        public Criteria andBookShelftimeIn(List<Date> values) {
            addCriterion("book_shelftime in", values, "bookShelftime");
            return (Criteria) this;
        }

        public Criteria andBookShelftimeNotIn(List<Date> values) {
            addCriterion("book_shelftime not in", values, "bookShelftime");
            return (Criteria) this;
        }

        public Criteria andBookShelftimeBetween(Date value1, Date value2) {
            addCriterion("book_shelftime between", value1, value2, "bookShelftime");
            return (Criteria) this;
        }

        public Criteria andBookShelftimeNotBetween(Date value1, Date value2) {
            addCriterion("book_shelftime not between", value1, value2, "bookShelftime");
            return (Criteria) this;
        }

        public Criteria andBookPresstimeIsNull() {
            addCriterion("book_presstime is null");
            return (Criteria) this;
        }

        public Criteria andBookPresstimeIsNotNull() {
            addCriterion("book_presstime is not null");
            return (Criteria) this;
        }

        public Criteria andBookPresstimeEqualTo(Date value) {
            addCriterion("book_presstime =", value, "bookPresstime");
            return (Criteria) this;
        }

        public Criteria andBookPresstimeNotEqualTo(Date value) {
            addCriterion("book_presstime <>", value, "bookPresstime");
            return (Criteria) this;
        }

        public Criteria andBookPresstimeGreaterThan(Date value) {
            addCriterion("book_presstime >", value, "bookPresstime");
            return (Criteria) this;
        }

        public Criteria andBookPresstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("book_presstime >=", value, "bookPresstime");
            return (Criteria) this;
        }

        public Criteria andBookPresstimeLessThan(Date value) {
            addCriterion("book_presstime <", value, "bookPresstime");
            return (Criteria) this;
        }

        public Criteria andBookPresstimeLessThanOrEqualTo(Date value) {
            addCriterion("book_presstime <=", value, "bookPresstime");
            return (Criteria) this;
        }

        public Criteria andBookPresstimeIn(List<Date> values) {
            addCriterion("book_presstime in", values, "bookPresstime");
            return (Criteria) this;
        }

        public Criteria andBookPresstimeNotIn(List<Date> values) {
            addCriterion("book_presstime not in", values, "bookPresstime");
            return (Criteria) this;
        }

        public Criteria andBookPresstimeBetween(Date value1, Date value2) {
            addCriterion("book_presstime between", value1, value2, "bookPresstime");
            return (Criteria) this;
        }

        public Criteria andBookPresstimeNotBetween(Date value1, Date value2) {
            addCriterion("book_presstime not between", value1, value2, "bookPresstime");
            return (Criteria) this;
        }

        public Criteria andBookIsbnIsNull() {
            addCriterion("book_isbn is null");
            return (Criteria) this;
        }

        public Criteria andBookIsbnIsNotNull() {
            addCriterion("book_isbn is not null");
            return (Criteria) this;
        }

        public Criteria andBookIsbnEqualTo(String value) {
            addCriterion("book_isbn =", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnNotEqualTo(String value) {
            addCriterion("book_isbn <>", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnGreaterThan(String value) {
            addCriterion("book_isbn >", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("book_isbn >=", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnLessThan(String value) {
            addCriterion("book_isbn <", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnLessThanOrEqualTo(String value) {
            addCriterion("book_isbn <=", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnLike(String value) {
            addCriterion("book_isbn like", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnNotLike(String value) {
            addCriterion("book_isbn not like", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnIn(List<String> values) {
            addCriterion("book_isbn in", values, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnNotIn(List<String> values) {
            addCriterion("book_isbn not in", values, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnBetween(String value1, String value2) {
            addCriterion("book_isbn between", value1, value2, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnNotBetween(String value1, String value2) {
            addCriterion("book_isbn not between", value1, value2, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookPressIsNull() {
            addCriterion("book_press is null");
            return (Criteria) this;
        }

        public Criteria andBookPressIsNotNull() {
            addCriterion("book_press is not null");
            return (Criteria) this;
        }

        public Criteria andBookPressEqualTo(String value) {
            addCriterion("book_press =", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressNotEqualTo(String value) {
            addCriterion("book_press <>", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressGreaterThan(String value) {
            addCriterion("book_press >", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressGreaterThanOrEqualTo(String value) {
            addCriterion("book_press >=", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressLessThan(String value) {
            addCriterion("book_press <", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressLessThanOrEqualTo(String value) {
            addCriterion("book_press <=", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressLike(String value) {
            addCriterion("book_press like", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressNotLike(String value) {
            addCriterion("book_press not like", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressIn(List<String> values) {
            addCriterion("book_press in", values, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressNotIn(List<String> values) {
            addCriterion("book_press not in", values, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressBetween(String value1, String value2) {
            addCriterion("book_press between", value1, value2, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressNotBetween(String value1, String value2) {
            addCriterion("book_press not between", value1, value2, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookDesIsNull() {
            addCriterion("book_des is null");
            return (Criteria) this;
        }

        public Criteria andBookDesIsNotNull() {
            addCriterion("book_des is not null");
            return (Criteria) this;
        }

        public Criteria andBookDesEqualTo(String value) {
            addCriterion("book_des =", value, "bookDes");
            return (Criteria) this;
        }

        public Criteria andBookDesNotEqualTo(String value) {
            addCriterion("book_des <>", value, "bookDes");
            return (Criteria) this;
        }

        public Criteria andBookDesGreaterThan(String value) {
            addCriterion("book_des >", value, "bookDes");
            return (Criteria) this;
        }

        public Criteria andBookDesGreaterThanOrEqualTo(String value) {
            addCriterion("book_des >=", value, "bookDes");
            return (Criteria) this;
        }

        public Criteria andBookDesLessThan(String value) {
            addCriterion("book_des <", value, "bookDes");
            return (Criteria) this;
        }

        public Criteria andBookDesLessThanOrEqualTo(String value) {
            addCriterion("book_des <=", value, "bookDes");
            return (Criteria) this;
        }

        public Criteria andBookDesLike(String value) {
            addCriterion("book_des like", value, "bookDes");
            return (Criteria) this;
        }

        public Criteria andBookDesNotLike(String value) {
            addCriterion("book_des not like", value, "bookDes");
            return (Criteria) this;
        }

        public Criteria andBookDesIn(List<String> values) {
            addCriterion("book_des in", values, "bookDes");
            return (Criteria) this;
        }

        public Criteria andBookDesNotIn(List<String> values) {
            addCriterion("book_des not in", values, "bookDes");
            return (Criteria) this;
        }

        public Criteria andBookDesBetween(String value1, String value2) {
            addCriterion("book_des between", value1, value2, "bookDes");
            return (Criteria) this;
        }

        public Criteria andBookDesNotBetween(String value1, String value2) {
            addCriterion("book_des not between", value1, value2, "bookDes");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("author_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(Integer value) {
            addCriterion("author_id =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(Integer value) {
            addCriterion("author_id <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(Integer value) {
            addCriterion("author_id >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("author_id >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(Integer value) {
            addCriterion("author_id <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(Integer value) {
            addCriterion("author_id <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<Integer> values) {
            addCriterion("author_id in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<Integer> values) {
            addCriterion("author_id not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(Integer value1, Integer value2) {
            addCriterion("author_id between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("author_id not between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andBookImgIsNull() {
            addCriterion("book_img is null");
            return (Criteria) this;
        }

        public Criteria andBookImgIsNotNull() {
            addCriterion("book_img is not null");
            return (Criteria) this;
        }

        public Criteria andBookImgEqualTo(String value) {
            addCriterion("book_img =", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgNotEqualTo(String value) {
            addCriterion("book_img <>", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgGreaterThan(String value) {
            addCriterion("book_img >", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgGreaterThanOrEqualTo(String value) {
            addCriterion("book_img >=", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgLessThan(String value) {
            addCriterion("book_img <", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgLessThanOrEqualTo(String value) {
            addCriterion("book_img <=", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgLike(String value) {
            addCriterion("book_img like", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgNotLike(String value) {
            addCriterion("book_img not like", value, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgIn(List<String> values) {
            addCriterion("book_img in", values, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgNotIn(List<String> values) {
            addCriterion("book_img not in", values, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgBetween(String value1, String value2) {
            addCriterion("book_img between", value1, value2, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImgNotBetween(String value1, String value2) {
            addCriterion("book_img not between", value1, value2, "bookImg");
            return (Criteria) this;
        }

        public Criteria andBookImg2IsNull() {
            addCriterion("book_img2 is null");
            return (Criteria) this;
        }

        public Criteria andBookImg2IsNotNull() {
            addCriterion("book_img2 is not null");
            return (Criteria) this;
        }

        public Criteria andBookImg2EqualTo(String value) {
            addCriterion("book_img2 =", value, "bookImg2");
            return (Criteria) this;
        }

        public Criteria andBookImg2NotEqualTo(String value) {
            addCriterion("book_img2 <>", value, "bookImg2");
            return (Criteria) this;
        }

        public Criteria andBookImg2GreaterThan(String value) {
            addCriterion("book_img2 >", value, "bookImg2");
            return (Criteria) this;
        }

        public Criteria andBookImg2GreaterThanOrEqualTo(String value) {
            addCriterion("book_img2 >=", value, "bookImg2");
            return (Criteria) this;
        }

        public Criteria andBookImg2LessThan(String value) {
            addCriterion("book_img2 <", value, "bookImg2");
            return (Criteria) this;
        }

        public Criteria andBookImg2LessThanOrEqualTo(String value) {
            addCriterion("book_img2 <=", value, "bookImg2");
            return (Criteria) this;
        }

        public Criteria andBookImg2Like(String value) {
            addCriterion("book_img2 like", value, "bookImg2");
            return (Criteria) this;
        }

        public Criteria andBookImg2NotLike(String value) {
            addCriterion("book_img2 not like", value, "bookImg2");
            return (Criteria) this;
        }

        public Criteria andBookImg2In(List<String> values) {
            addCriterion("book_img2 in", values, "bookImg2");
            return (Criteria) this;
        }

        public Criteria andBookImg2NotIn(List<String> values) {
            addCriterion("book_img2 not in", values, "bookImg2");
            return (Criteria) this;
        }

        public Criteria andBookImg2Between(String value1, String value2) {
            addCriterion("book_img2 between", value1, value2, "bookImg2");
            return (Criteria) this;
        }

        public Criteria andBookImg2NotBetween(String value1, String value2) {
            addCriterion("book_img2 not between", value1, value2, "bookImg2");
            return (Criteria) this;
        }

        public Criteria andBookImg3IsNull() {
            addCriterion("book_img3 is null");
            return (Criteria) this;
        }

        public Criteria andBookImg3IsNotNull() {
            addCriterion("book_img3 is not null");
            return (Criteria) this;
        }

        public Criteria andBookImg3EqualTo(String value) {
            addCriterion("book_img3 =", value, "bookImg3");
            return (Criteria) this;
        }

        public Criteria andBookImg3NotEqualTo(String value) {
            addCriterion("book_img3 <>", value, "bookImg3");
            return (Criteria) this;
        }

        public Criteria andBookImg3GreaterThan(String value) {
            addCriterion("book_img3 >", value, "bookImg3");
            return (Criteria) this;
        }

        public Criteria andBookImg3GreaterThanOrEqualTo(String value) {
            addCriterion("book_img3 >=", value, "bookImg3");
            return (Criteria) this;
        }

        public Criteria andBookImg3LessThan(String value) {
            addCriterion("book_img3 <", value, "bookImg3");
            return (Criteria) this;
        }

        public Criteria andBookImg3LessThanOrEqualTo(String value) {
            addCriterion("book_img3 <=", value, "bookImg3");
            return (Criteria) this;
        }

        public Criteria andBookImg3Like(String value) {
            addCriterion("book_img3 like", value, "bookImg3");
            return (Criteria) this;
        }

        public Criteria andBookImg3NotLike(String value) {
            addCriterion("book_img3 not like", value, "bookImg3");
            return (Criteria) this;
        }

        public Criteria andBookImg3In(List<String> values) {
            addCriterion("book_img3 in", values, "bookImg3");
            return (Criteria) this;
        }

        public Criteria andBookImg3NotIn(List<String> values) {
            addCriterion("book_img3 not in", values, "bookImg3");
            return (Criteria) this;
        }

        public Criteria andBookImg3Between(String value1, String value2) {
            addCriterion("book_img3 between", value1, value2, "bookImg3");
            return (Criteria) this;
        }

        public Criteria andBookImg3NotBetween(String value1, String value2) {
            addCriterion("book_img3 not between", value1, value2, "bookImg3");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNull() {
            addCriterion("cate_id is null");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNotNull() {
            addCriterion("cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCateIdEqualTo(Integer value) {
            addCriterion("cate_id =", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotEqualTo(Integer value) {
            addCriterion("cate_id <>", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThan(Integer value) {
            addCriterion("cate_id >", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cate_id >=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThan(Integer value) {
            addCriterion("cate_id <", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThanOrEqualTo(Integer value) {
            addCriterion("cate_id <=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdIn(List<Integer> values) {
            addCriterion("cate_id in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotIn(List<Integer> values) {
            addCriterion("cate_id not in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdBetween(Integer value1, Integer value2) {
            addCriterion("cate_id between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cate_id not between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andBookFlagIsNull() {
            addCriterion("book_flag is null");
            return (Criteria) this;
        }

        public Criteria andBookFlagIsNotNull() {
            addCriterion("book_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBookFlagEqualTo(Integer value) {
            addCriterion("book_flag =", value, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagNotEqualTo(Integer value) {
            addCriterion("book_flag <>", value, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagGreaterThan(Integer value) {
            addCriterion("book_flag >", value, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_flag >=", value, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagLessThan(Integer value) {
            addCriterion("book_flag <", value, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagLessThanOrEqualTo(Integer value) {
            addCriterion("book_flag <=", value, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagIn(List<Integer> values) {
            addCriterion("book_flag in", values, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagNotIn(List<Integer> values) {
            addCriterion("book_flag not in", values, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagBetween(Integer value1, Integer value2) {
            addCriterion("book_flag between", value1, value2, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("book_flag not between", value1, value2, "bookFlag");
            return (Criteria) this;
        }

        public Criteria andBookRecommendIsNull() {
            addCriterion("book_recommend is null");
            return (Criteria) this;
        }

        public Criteria andBookRecommendIsNotNull() {
            addCriterion("book_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andBookRecommendEqualTo(String value) {
            addCriterion("book_recommend =", value, "bookRecommend");
            return (Criteria) this;
        }

        public Criteria andBookRecommendNotEqualTo(String value) {
            addCriterion("book_recommend <>", value, "bookRecommend");
            return (Criteria) this;
        }

        public Criteria andBookRecommendGreaterThan(String value) {
            addCriterion("book_recommend >", value, "bookRecommend");
            return (Criteria) this;
        }

        public Criteria andBookRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("book_recommend >=", value, "bookRecommend");
            return (Criteria) this;
        }

        public Criteria andBookRecommendLessThan(String value) {
            addCriterion("book_recommend <", value, "bookRecommend");
            return (Criteria) this;
        }

        public Criteria andBookRecommendLessThanOrEqualTo(String value) {
            addCriterion("book_recommend <=", value, "bookRecommend");
            return (Criteria) this;
        }

        public Criteria andBookRecommendLike(String value) {
            addCriterion("book_recommend like", value, "bookRecommend");
            return (Criteria) this;
        }

        public Criteria andBookRecommendNotLike(String value) {
            addCriterion("book_recommend not like", value, "bookRecommend");
            return (Criteria) this;
        }

        public Criteria andBookRecommendIn(List<String> values) {
            addCriterion("book_recommend in", values, "bookRecommend");
            return (Criteria) this;
        }

        public Criteria andBookRecommendNotIn(List<String> values) {
            addCriterion("book_recommend not in", values, "bookRecommend");
            return (Criteria) this;
        }

        public Criteria andBookRecommendBetween(String value1, String value2) {
            addCriterion("book_recommend between", value1, value2, "bookRecommend");
            return (Criteria) this;
        }

        public Criteria andBookRecommendNotBetween(String value1, String value2) {
            addCriterion("book_recommend not between", value1, value2, "bookRecommend");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}