package com.ncuedu.bookshopserver.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderitemExample() {
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

        public Criteria andOrderitemIdIsNull() {
            addCriterion("orderItem_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdIsNotNull() {
            addCriterion("orderItem_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdEqualTo(Integer value) {
            addCriterion("orderItem_id =", value, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdNotEqualTo(Integer value) {
            addCriterion("orderItem_id <>", value, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdGreaterThan(Integer value) {
            addCriterion("orderItem_id >", value, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderItem_id >=", value, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdLessThan(Integer value) {
            addCriterion("orderItem_id <", value, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdLessThanOrEqualTo(Integer value) {
            addCriterion("orderItem_id <=", value, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdIn(List<Integer> values) {
            addCriterion("orderItem_id in", values, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdNotIn(List<Integer> values) {
            addCriterion("orderItem_id not in", values, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdBetween(Integer value1, Integer value2) {
            addCriterion("orderItem_id between", value1, value2, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orderItem_id not between", value1, value2, "orderitemId");
            return (Criteria) this;
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

        public Criteria andOrderitemAmountIsNull() {
            addCriterion("orderItem_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemAmountIsNotNull() {
            addCriterion("orderItem_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemAmountEqualTo(Integer value) {
            addCriterion("orderItem_amount =", value, "orderitemAmount");
            return (Criteria) this;
        }

        public Criteria andOrderitemAmountNotEqualTo(Integer value) {
            addCriterion("orderItem_amount <>", value, "orderitemAmount");
            return (Criteria) this;
        }

        public Criteria andOrderitemAmountGreaterThan(Integer value) {
            addCriterion("orderItem_amount >", value, "orderitemAmount");
            return (Criteria) this;
        }

        public Criteria andOrderitemAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderItem_amount >=", value, "orderitemAmount");
            return (Criteria) this;
        }

        public Criteria andOrderitemAmountLessThan(Integer value) {
            addCriterion("orderItem_amount <", value, "orderitemAmount");
            return (Criteria) this;
        }

        public Criteria andOrderitemAmountLessThanOrEqualTo(Integer value) {
            addCriterion("orderItem_amount <=", value, "orderitemAmount");
            return (Criteria) this;
        }

        public Criteria andOrderitemAmountIn(List<Integer> values) {
            addCriterion("orderItem_amount in", values, "orderitemAmount");
            return (Criteria) this;
        }

        public Criteria andOrderitemAmountNotIn(List<Integer> values) {
            addCriterion("orderItem_amount not in", values, "orderitemAmount");
            return (Criteria) this;
        }

        public Criteria andOrderitemAmountBetween(Integer value1, Integer value2) {
            addCriterion("orderItem_amount between", value1, value2, "orderitemAmount");
            return (Criteria) this;
        }

        public Criteria andOrderitemAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("orderItem_amount not between", value1, value2, "orderitemAmount");
            return (Criteria) this;
        }

        public Criteria andOrderitemPriceIsNull() {
            addCriterion("orderItem_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPriceIsNotNull() {
            addCriterion("orderItem_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPriceEqualTo(BigDecimal value) {
            addCriterion("orderItem_price =", value, "orderitemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderitemPriceNotEqualTo(BigDecimal value) {
            addCriterion("orderItem_price <>", value, "orderitemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderitemPriceGreaterThan(BigDecimal value) {
            addCriterion("orderItem_price >", value, "orderitemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderitemPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orderItem_price >=", value, "orderitemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderitemPriceLessThan(BigDecimal value) {
            addCriterion("orderItem_price <", value, "orderitemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderitemPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orderItem_price <=", value, "orderitemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderitemPriceIn(List<BigDecimal> values) {
            addCriterion("orderItem_price in", values, "orderitemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderitemPriceNotIn(List<BigDecimal> values) {
            addCriterion("orderItem_price not in", values, "orderitemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderitemPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderItem_price between", value1, value2, "orderitemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderitemPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderItem_price not between", value1, value2, "orderitemPrice");
            return (Criteria) this;
        }

        public Criteria andOrderitemStateIsNull() {
            addCriterion("orderItem_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemStateIsNotNull() {
            addCriterion("orderItem_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemStateEqualTo(Integer value) {
            addCriterion("orderItem_state =", value, "orderitemState");
            return (Criteria) this;
        }

        public Criteria andOrderitemStateNotEqualTo(Integer value) {
            addCriterion("orderItem_state <>", value, "orderitemState");
            return (Criteria) this;
        }

        public Criteria andOrderitemStateGreaterThan(Integer value) {
            addCriterion("orderItem_state >", value, "orderitemState");
            return (Criteria) this;
        }

        public Criteria andOrderitemStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderItem_state >=", value, "orderitemState");
            return (Criteria) this;
        }

        public Criteria andOrderitemStateLessThan(Integer value) {
            addCriterion("orderItem_state <", value, "orderitemState");
            return (Criteria) this;
        }

        public Criteria andOrderitemStateLessThanOrEqualTo(Integer value) {
            addCriterion("orderItem_state <=", value, "orderitemState");
            return (Criteria) this;
        }

        public Criteria andOrderitemStateIn(List<Integer> values) {
            addCriterion("orderItem_state in", values, "orderitemState");
            return (Criteria) this;
        }

        public Criteria andOrderitemStateNotIn(List<Integer> values) {
            addCriterion("orderItem_state not in", values, "orderitemState");
            return (Criteria) this;
        }

        public Criteria andOrderitemStateBetween(Integer value1, Integer value2) {
            addCriterion("orderItem_state between", value1, value2, "orderitemState");
            return (Criteria) this;
        }

        public Criteria andOrderitemStateNotBetween(Integer value1, Integer value2) {
            addCriterion("orderItem_state not between", value1, value2, "orderitemState");
            return (Criteria) this;
        }

        public Criteria andOrderitemRemarkIsNull() {
            addCriterion("orderItem_remark is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemRemarkIsNotNull() {
            addCriterion("orderItem_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemRemarkEqualTo(String value) {
            addCriterion("orderItem_remark =", value, "orderitemRemark");
            return (Criteria) this;
        }

        public Criteria andOrderitemRemarkNotEqualTo(String value) {
            addCriterion("orderItem_remark <>", value, "orderitemRemark");
            return (Criteria) this;
        }

        public Criteria andOrderitemRemarkGreaterThan(String value) {
            addCriterion("orderItem_remark >", value, "orderitemRemark");
            return (Criteria) this;
        }

        public Criteria andOrderitemRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("orderItem_remark >=", value, "orderitemRemark");
            return (Criteria) this;
        }

        public Criteria andOrderitemRemarkLessThan(String value) {
            addCriterion("orderItem_remark <", value, "orderitemRemark");
            return (Criteria) this;
        }

        public Criteria andOrderitemRemarkLessThanOrEqualTo(String value) {
            addCriterion("orderItem_remark <=", value, "orderitemRemark");
            return (Criteria) this;
        }

        public Criteria andOrderitemRemarkLike(String value) {
            addCriterion("orderItem_remark like", value, "orderitemRemark");
            return (Criteria) this;
        }

        public Criteria andOrderitemRemarkNotLike(String value) {
            addCriterion("orderItem_remark not like", value, "orderitemRemark");
            return (Criteria) this;
        }

        public Criteria andOrderitemRemarkIn(List<String> values) {
            addCriterion("orderItem_remark in", values, "orderitemRemark");
            return (Criteria) this;
        }

        public Criteria andOrderitemRemarkNotIn(List<String> values) {
            addCriterion("orderItem_remark not in", values, "orderitemRemark");
            return (Criteria) this;
        }

        public Criteria andOrderitemRemarkBetween(String value1, String value2) {
            addCriterion("orderItem_remark between", value1, value2, "orderitemRemark");
            return (Criteria) this;
        }

        public Criteria andOrderitemRemarkNotBetween(String value1, String value2) {
            addCriterion("orderItem_remark not between", value1, value2, "orderitemRemark");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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