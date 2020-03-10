package com.ncuedu.bookshopserver.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HeadlineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HeadlineExample() {
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

        public Criteria andHeadlineIdIsNull() {
            addCriterion("headline_id is null");
            return (Criteria) this;
        }

        public Criteria andHeadlineIdIsNotNull() {
            addCriterion("headline_id is not null");
            return (Criteria) this;
        }

        public Criteria andHeadlineIdEqualTo(Integer value) {
            addCriterion("headline_id =", value, "headlineId");
            return (Criteria) this;
        }

        public Criteria andHeadlineIdNotEqualTo(Integer value) {
            addCriterion("headline_id <>", value, "headlineId");
            return (Criteria) this;
        }

        public Criteria andHeadlineIdGreaterThan(Integer value) {
            addCriterion("headline_id >", value, "headlineId");
            return (Criteria) this;
        }

        public Criteria andHeadlineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("headline_id >=", value, "headlineId");
            return (Criteria) this;
        }

        public Criteria andHeadlineIdLessThan(Integer value) {
            addCriterion("headline_id <", value, "headlineId");
            return (Criteria) this;
        }

        public Criteria andHeadlineIdLessThanOrEqualTo(Integer value) {
            addCriterion("headline_id <=", value, "headlineId");
            return (Criteria) this;
        }

        public Criteria andHeadlineIdIn(List<Integer> values) {
            addCriterion("headline_id in", values, "headlineId");
            return (Criteria) this;
        }

        public Criteria andHeadlineIdNotIn(List<Integer> values) {
            addCriterion("headline_id not in", values, "headlineId");
            return (Criteria) this;
        }

        public Criteria andHeadlineIdBetween(Integer value1, Integer value2) {
            addCriterion("headline_id between", value1, value2, "headlineId");
            return (Criteria) this;
        }

        public Criteria andHeadlineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("headline_id not between", value1, value2, "headlineId");
            return (Criteria) this;
        }

        public Criteria andHeadlineContentIsNull() {
            addCriterion("headline_content is null");
            return (Criteria) this;
        }

        public Criteria andHeadlineContentIsNotNull() {
            addCriterion("headline_content is not null");
            return (Criteria) this;
        }

        public Criteria andHeadlineContentEqualTo(String value) {
            addCriterion("headline_content =", value, "headlineContent");
            return (Criteria) this;
        }

        public Criteria andHeadlineContentNotEqualTo(String value) {
            addCriterion("headline_content <>", value, "headlineContent");
            return (Criteria) this;
        }

        public Criteria andHeadlineContentGreaterThan(String value) {
            addCriterion("headline_content >", value, "headlineContent");
            return (Criteria) this;
        }

        public Criteria andHeadlineContentGreaterThanOrEqualTo(String value) {
            addCriterion("headline_content >=", value, "headlineContent");
            return (Criteria) this;
        }

        public Criteria andHeadlineContentLessThan(String value) {
            addCriterion("headline_content <", value, "headlineContent");
            return (Criteria) this;
        }

        public Criteria andHeadlineContentLessThanOrEqualTo(String value) {
            addCriterion("headline_content <=", value, "headlineContent");
            return (Criteria) this;
        }

        public Criteria andHeadlineContentLike(String value) {
            addCriterion("headline_content like", value, "headlineContent");
            return (Criteria) this;
        }

        public Criteria andHeadlineContentNotLike(String value) {
            addCriterion("headline_content not like", value, "headlineContent");
            return (Criteria) this;
        }

        public Criteria andHeadlineContentIn(List<String> values) {
            addCriterion("headline_content in", values, "headlineContent");
            return (Criteria) this;
        }

        public Criteria andHeadlineContentNotIn(List<String> values) {
            addCriterion("headline_content not in", values, "headlineContent");
            return (Criteria) this;
        }

        public Criteria andHeadlineContentBetween(String value1, String value2) {
            addCriterion("headline_content between", value1, value2, "headlineContent");
            return (Criteria) this;
        }

        public Criteria andHeadlineContentNotBetween(String value1, String value2) {
            addCriterion("headline_content not between", value1, value2, "headlineContent");
            return (Criteria) this;
        }

        public Criteria andHeadlineImgIsNull() {
            addCriterion("headline_img is null");
            return (Criteria) this;
        }

        public Criteria andHeadlineImgIsNotNull() {
            addCriterion("headline_img is not null");
            return (Criteria) this;
        }

        public Criteria andHeadlineImgEqualTo(String value) {
            addCriterion("headline_img =", value, "headlineImg");
            return (Criteria) this;
        }

        public Criteria andHeadlineImgNotEqualTo(String value) {
            addCriterion("headline_img <>", value, "headlineImg");
            return (Criteria) this;
        }

        public Criteria andHeadlineImgGreaterThan(String value) {
            addCriterion("headline_img >", value, "headlineImg");
            return (Criteria) this;
        }

        public Criteria andHeadlineImgGreaterThanOrEqualTo(String value) {
            addCriterion("headline_img >=", value, "headlineImg");
            return (Criteria) this;
        }

        public Criteria andHeadlineImgLessThan(String value) {
            addCriterion("headline_img <", value, "headlineImg");
            return (Criteria) this;
        }

        public Criteria andHeadlineImgLessThanOrEqualTo(String value) {
            addCriterion("headline_img <=", value, "headlineImg");
            return (Criteria) this;
        }

        public Criteria andHeadlineImgLike(String value) {
            addCriterion("headline_img like", value, "headlineImg");
            return (Criteria) this;
        }

        public Criteria andHeadlineImgNotLike(String value) {
            addCriterion("headline_img not like", value, "headlineImg");
            return (Criteria) this;
        }

        public Criteria andHeadlineImgIn(List<String> values) {
            addCriterion("headline_img in", values, "headlineImg");
            return (Criteria) this;
        }

        public Criteria andHeadlineImgNotIn(List<String> values) {
            addCriterion("headline_img not in", values, "headlineImg");
            return (Criteria) this;
        }

        public Criteria andHeadlineImgBetween(String value1, String value2) {
            addCriterion("headline_img between", value1, value2, "headlineImg");
            return (Criteria) this;
        }

        public Criteria andHeadlineImgNotBetween(String value1, String value2) {
            addCriterion("headline_img not between", value1, value2, "headlineImg");
            return (Criteria) this;
        }

        public Criteria andHeadlineTimeIsNull() {
            addCriterion("headline_time is null");
            return (Criteria) this;
        }

        public Criteria andHeadlineTimeIsNotNull() {
            addCriterion("headline_time is not null");
            return (Criteria) this;
        }

        public Criteria andHeadlineTimeEqualTo(Date value) {
            addCriterion("headline_time =", value, "headlineTime");
            return (Criteria) this;
        }

        public Criteria andHeadlineTimeNotEqualTo(Date value) {
            addCriterion("headline_time <>", value, "headlineTime");
            return (Criteria) this;
        }

        public Criteria andHeadlineTimeGreaterThan(Date value) {
            addCriterion("headline_time >", value, "headlineTime");
            return (Criteria) this;
        }

        public Criteria andHeadlineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("headline_time >=", value, "headlineTime");
            return (Criteria) this;
        }

        public Criteria andHeadlineTimeLessThan(Date value) {
            addCriterion("headline_time <", value, "headlineTime");
            return (Criteria) this;
        }

        public Criteria andHeadlineTimeLessThanOrEqualTo(Date value) {
            addCriterion("headline_time <=", value, "headlineTime");
            return (Criteria) this;
        }

        public Criteria andHeadlineTimeIn(List<Date> values) {
            addCriterion("headline_time in", values, "headlineTime");
            return (Criteria) this;
        }

        public Criteria andHeadlineTimeNotIn(List<Date> values) {
            addCriterion("headline_time not in", values, "headlineTime");
            return (Criteria) this;
        }

        public Criteria andHeadlineTimeBetween(Date value1, Date value2) {
            addCriterion("headline_time between", value1, value2, "headlineTime");
            return (Criteria) this;
        }

        public Criteria andHeadlineTimeNotBetween(Date value1, Date value2) {
            addCriterion("headline_time not between", value1, value2, "headlineTime");
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