package com.ncuedu.bookshopserver.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartExample() {
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

        public Criteria andCartIdIsNull() {
            addCriterion("cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNotNull() {
            addCriterion("cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartIdEqualTo(Integer value) {
            addCriterion("cart_id =", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotEqualTo(Integer value) {
            addCriterion("cart_id <>", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThan(Integer value) {
            addCriterion("cart_id >", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_id >=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThan(Integer value) {
            addCriterion("cart_id <", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThanOrEqualTo(Integer value) {
            addCriterion("cart_id <=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdIn(List<Integer> values) {
            addCriterion("cart_id in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotIn(List<Integer> values) {
            addCriterion("cart_id not in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdBetween(Integer value1, Integer value2) {
            addCriterion("cart_id between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_id not between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andCartAmountIsNull() {
            addCriterion("cart_amount is null");
            return (Criteria) this;
        }

        public Criteria andCartAmountIsNotNull() {
            addCriterion("cart_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCartAmountEqualTo(Integer value) {
            addCriterion("cart_amount =", value, "cartAmount");
            return (Criteria) this;
        }

        public Criteria andCartAmountNotEqualTo(Integer value) {
            addCriterion("cart_amount <>", value, "cartAmount");
            return (Criteria) this;
        }

        public Criteria andCartAmountGreaterThan(Integer value) {
            addCriterion("cart_amount >", value, "cartAmount");
            return (Criteria) this;
        }

        public Criteria andCartAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_amount >=", value, "cartAmount");
            return (Criteria) this;
        }

        public Criteria andCartAmountLessThan(Integer value) {
            addCriterion("cart_amount <", value, "cartAmount");
            return (Criteria) this;
        }

        public Criteria andCartAmountLessThanOrEqualTo(Integer value) {
            addCriterion("cart_amount <=", value, "cartAmount");
            return (Criteria) this;
        }

        public Criteria andCartAmountIn(List<Integer> values) {
            addCriterion("cart_amount in", values, "cartAmount");
            return (Criteria) this;
        }

        public Criteria andCartAmountNotIn(List<Integer> values) {
            addCriterion("cart_amount not in", values, "cartAmount");
            return (Criteria) this;
        }

        public Criteria andCartAmountBetween(Integer value1, Integer value2) {
            addCriterion("cart_amount between", value1, value2, "cartAmount");
            return (Criteria) this;
        }

        public Criteria andCartAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_amount not between", value1, value2, "cartAmount");
            return (Criteria) this;
        }

        public Criteria andCartTimeIsNull() {
            addCriterion("cart_time is null");
            return (Criteria) this;
        }

        public Criteria andCartTimeIsNotNull() {
            addCriterion("cart_time is not null");
            return (Criteria) this;
        }

        public Criteria andCartTimeEqualTo(Date value) {
            addCriterion("cart_time =", value, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeNotEqualTo(Date value) {
            addCriterion("cart_time <>", value, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeGreaterThan(Date value) {
            addCriterion("cart_time >", value, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cart_time >=", value, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeLessThan(Date value) {
            addCriterion("cart_time <", value, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeLessThanOrEqualTo(Date value) {
            addCriterion("cart_time <=", value, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeIn(List<Date> values) {
            addCriterion("cart_time in", values, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeNotIn(List<Date> values) {
            addCriterion("cart_time not in", values, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeBetween(Date value1, Date value2) {
            addCriterion("cart_time between", value1, value2, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeNotBetween(Date value1, Date value2) {
            addCriterion("cart_time not between", value1, value2, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartPriceIsNull() {
            addCriterion("cart_price is null");
            return (Criteria) this;
        }

        public Criteria andCartPriceIsNotNull() {
            addCriterion("cart_price is not null");
            return (Criteria) this;
        }

        public Criteria andCartPriceEqualTo(BigDecimal value) {
            addCriterion("cart_price =", value, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceNotEqualTo(BigDecimal value) {
            addCriterion("cart_price <>", value, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceGreaterThan(BigDecimal value) {
            addCriterion("cart_price >", value, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cart_price >=", value, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceLessThan(BigDecimal value) {
            addCriterion("cart_price <", value, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cart_price <=", value, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceIn(List<BigDecimal> values) {
            addCriterion("cart_price in", values, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceNotIn(List<BigDecimal> values) {
            addCriterion("cart_price not in", values, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cart_price between", value1, value2, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cart_price not between", value1, value2, "cartPrice");
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