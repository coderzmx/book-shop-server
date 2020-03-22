package com.ncuedu.bookshopserver.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccessExample() {
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

        public Criteria andAccessIdIsNull() {
            addCriterion("access_id is null");
            return (Criteria) this;
        }

        public Criteria andAccessIdIsNotNull() {
            addCriterion("access_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccessIdEqualTo(Integer value) {
            addCriterion("access_id =", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdNotEqualTo(Integer value) {
            addCriterion("access_id <>", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdGreaterThan(Integer value) {
            addCriterion("access_id >", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("access_id >=", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdLessThan(Integer value) {
            addCriterion("access_id <", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdLessThanOrEqualTo(Integer value) {
            addCriterion("access_id <=", value, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdIn(List<Integer> values) {
            addCriterion("access_id in", values, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdNotIn(List<Integer> values) {
            addCriterion("access_id not in", values, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdBetween(Integer value1, Integer value2) {
            addCriterion("access_id between", value1, value2, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("access_id not between", value1, value2, "accessId");
            return (Criteria) this;
        }

        public Criteria andAccessTitleIsNull() {
            addCriterion("access_title is null");
            return (Criteria) this;
        }

        public Criteria andAccessTitleIsNotNull() {
            addCriterion("access_title is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTitleEqualTo(String value) {
            addCriterion("access_title =", value, "accessTitle");
            return (Criteria) this;
        }

        public Criteria andAccessTitleNotEqualTo(String value) {
            addCriterion("access_title <>", value, "accessTitle");
            return (Criteria) this;
        }

        public Criteria andAccessTitleGreaterThan(String value) {
            addCriterion("access_title >", value, "accessTitle");
            return (Criteria) this;
        }

        public Criteria andAccessTitleGreaterThanOrEqualTo(String value) {
            addCriterion("access_title >=", value, "accessTitle");
            return (Criteria) this;
        }

        public Criteria andAccessTitleLessThan(String value) {
            addCriterion("access_title <", value, "accessTitle");
            return (Criteria) this;
        }

        public Criteria andAccessTitleLessThanOrEqualTo(String value) {
            addCriterion("access_title <=", value, "accessTitle");
            return (Criteria) this;
        }

        public Criteria andAccessTitleLike(String value) {
            addCriterion("access_title like", value, "accessTitle");
            return (Criteria) this;
        }

        public Criteria andAccessTitleNotLike(String value) {
            addCriterion("access_title not like", value, "accessTitle");
            return (Criteria) this;
        }

        public Criteria andAccessTitleIn(List<String> values) {
            addCriterion("access_title in", values, "accessTitle");
            return (Criteria) this;
        }

        public Criteria andAccessTitleNotIn(List<String> values) {
            addCriterion("access_title not in", values, "accessTitle");
            return (Criteria) this;
        }

        public Criteria andAccessTitleBetween(String value1, String value2) {
            addCriterion("access_title between", value1, value2, "accessTitle");
            return (Criteria) this;
        }

        public Criteria andAccessTitleNotBetween(String value1, String value2) {
            addCriterion("access_title not between", value1, value2, "accessTitle");
            return (Criteria) this;
        }

        public Criteria andAccessUriIsNull() {
            addCriterion("access_uri is null");
            return (Criteria) this;
        }

        public Criteria andAccessUriIsNotNull() {
            addCriterion("access_uri is not null");
            return (Criteria) this;
        }

        public Criteria andAccessUriEqualTo(String value) {
            addCriterion("access_uri =", value, "accessUri");
            return (Criteria) this;
        }

        public Criteria andAccessUriNotEqualTo(String value) {
            addCriterion("access_uri <>", value, "accessUri");
            return (Criteria) this;
        }

        public Criteria andAccessUriGreaterThan(String value) {
            addCriterion("access_uri >", value, "accessUri");
            return (Criteria) this;
        }

        public Criteria andAccessUriGreaterThanOrEqualTo(String value) {
            addCriterion("access_uri >=", value, "accessUri");
            return (Criteria) this;
        }

        public Criteria andAccessUriLessThan(String value) {
            addCriterion("access_uri <", value, "accessUri");
            return (Criteria) this;
        }

        public Criteria andAccessUriLessThanOrEqualTo(String value) {
            addCriterion("access_uri <=", value, "accessUri");
            return (Criteria) this;
        }

        public Criteria andAccessUriLike(String value) {
            addCriterion("access_uri like", value, "accessUri");
            return (Criteria) this;
        }

        public Criteria andAccessUriNotLike(String value) {
            addCriterion("access_uri not like", value, "accessUri");
            return (Criteria) this;
        }

        public Criteria andAccessUriIn(List<String> values) {
            addCriterion("access_uri in", values, "accessUri");
            return (Criteria) this;
        }

        public Criteria andAccessUriNotIn(List<String> values) {
            addCriterion("access_uri not in", values, "accessUri");
            return (Criteria) this;
        }

        public Criteria andAccessUriBetween(String value1, String value2) {
            addCriterion("access_uri between", value1, value2, "accessUri");
            return (Criteria) this;
        }

        public Criteria andAccessUriNotBetween(String value1, String value2) {
            addCriterion("access_uri not between", value1, value2, "accessUri");
            return (Criteria) this;
        }

        public Criteria andAccessCreateTimeIsNull() {
            addCriterion("access_create_time is null");
            return (Criteria) this;
        }

        public Criteria andAccessCreateTimeIsNotNull() {
            addCriterion("access_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccessCreateTimeEqualTo(Date value) {
            addCriterion("access_create_time =", value, "accessCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccessCreateTimeNotEqualTo(Date value) {
            addCriterion("access_create_time <>", value, "accessCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccessCreateTimeGreaterThan(Date value) {
            addCriterion("access_create_time >", value, "accessCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccessCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("access_create_time >=", value, "accessCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccessCreateTimeLessThan(Date value) {
            addCriterion("access_create_time <", value, "accessCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccessCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("access_create_time <=", value, "accessCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccessCreateTimeIn(List<Date> values) {
            addCriterion("access_create_time in", values, "accessCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccessCreateTimeNotIn(List<Date> values) {
            addCriterion("access_create_time not in", values, "accessCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccessCreateTimeBetween(Date value1, Date value2) {
            addCriterion("access_create_time between", value1, value2, "accessCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccessCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("access_create_time not between", value1, value2, "accessCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccessUpdateTimeIsNull() {
            addCriterion("access_update_time is null");
            return (Criteria) this;
        }

        public Criteria andAccessUpdateTimeIsNotNull() {
            addCriterion("access_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccessUpdateTimeEqualTo(Date value) {
            addCriterion("access_update_time =", value, "accessUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAccessUpdateTimeNotEqualTo(Date value) {
            addCriterion("access_update_time <>", value, "accessUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAccessUpdateTimeGreaterThan(Date value) {
            addCriterion("access_update_time >", value, "accessUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAccessUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("access_update_time >=", value, "accessUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAccessUpdateTimeLessThan(Date value) {
            addCriterion("access_update_time <", value, "accessUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAccessUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("access_update_time <=", value, "accessUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAccessUpdateTimeIn(List<Date> values) {
            addCriterion("access_update_time in", values, "accessUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAccessUpdateTimeNotIn(List<Date> values) {
            addCriterion("access_update_time not in", values, "accessUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAccessUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("access_update_time between", value1, value2, "accessUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAccessUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("access_update_time not between", value1, value2, "accessUpdateTime");
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