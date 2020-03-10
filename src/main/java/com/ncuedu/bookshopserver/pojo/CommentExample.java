package com.ncuedu.bookshopserver.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
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

        public Criteria andCommentContentIsNull() {
            addCriterion("comment_content is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("comment_content =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("comment_content <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("comment_content >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("comment_content >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("comment_content <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("comment_content <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("comment_content like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("comment_content not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("comment_content in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("comment_content not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("comment_content between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("comment_content not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNull() {
            addCriterion("comment_time is null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNotNull() {
            addCriterion("comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeEqualTo(Date value) {
            addCriterion("comment_time =", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotEqualTo(Date value) {
            addCriterion("comment_time <>", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThan(Date value) {
            addCriterion("comment_time >", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_time >=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThan(Date value) {
            addCriterion("comment_time <", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("comment_time <=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIn(List<Date> values) {
            addCriterion("comment_time in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotIn(List<Date> values) {
            addCriterion("comment_time not in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeBetween(Date value1, Date value2) {
            addCriterion("comment_time between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("comment_time not between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseIsNull() {
            addCriterion("comment_praise is null");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseIsNotNull() {
            addCriterion("comment_praise is not null");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseEqualTo(Integer value) {
            addCriterion("comment_praise =", value, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseNotEqualTo(Integer value) {
            addCriterion("comment_praise <>", value, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseGreaterThan(Integer value) {
            addCriterion("comment_praise >", value, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_praise >=", value, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseLessThan(Integer value) {
            addCriterion("comment_praise <", value, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseLessThanOrEqualTo(Integer value) {
            addCriterion("comment_praise <=", value, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseIn(List<Integer> values) {
            addCriterion("comment_praise in", values, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseNotIn(List<Integer> values) {
            addCriterion("comment_praise not in", values, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseBetween(Integer value1, Integer value2) {
            addCriterion("comment_praise between", value1, value2, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentPraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_praise not between", value1, value2, "commentPraise");
            return (Criteria) this;
        }

        public Criteria andCommentGradeIsNull() {
            addCriterion("comment_grade is null");
            return (Criteria) this;
        }

        public Criteria andCommentGradeIsNotNull() {
            addCriterion("comment_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCommentGradeEqualTo(Integer value) {
            addCriterion("comment_grade =", value, "commentGrade");
            return (Criteria) this;
        }

        public Criteria andCommentGradeNotEqualTo(Integer value) {
            addCriterion("comment_grade <>", value, "commentGrade");
            return (Criteria) this;
        }

        public Criteria andCommentGradeGreaterThan(Integer value) {
            addCriterion("comment_grade >", value, "commentGrade");
            return (Criteria) this;
        }

        public Criteria andCommentGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_grade >=", value, "commentGrade");
            return (Criteria) this;
        }

        public Criteria andCommentGradeLessThan(Integer value) {
            addCriterion("comment_grade <", value, "commentGrade");
            return (Criteria) this;
        }

        public Criteria andCommentGradeLessThanOrEqualTo(Integer value) {
            addCriterion("comment_grade <=", value, "commentGrade");
            return (Criteria) this;
        }

        public Criteria andCommentGradeIn(List<Integer> values) {
            addCriterion("comment_grade in", values, "commentGrade");
            return (Criteria) this;
        }

        public Criteria andCommentGradeNotIn(List<Integer> values) {
            addCriterion("comment_grade not in", values, "commentGrade");
            return (Criteria) this;
        }

        public Criteria andCommentGradeBetween(Integer value1, Integer value2) {
            addCriterion("comment_grade between", value1, value2, "commentGrade");
            return (Criteria) this;
        }

        public Criteria andCommentGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_grade not between", value1, value2, "commentGrade");
            return (Criteria) this;
        }

        public Criteria andTargetIdIsNull() {
            addCriterion("target_id is null");
            return (Criteria) this;
        }

        public Criteria andTargetIdIsNotNull() {
            addCriterion("target_id is not null");
            return (Criteria) this;
        }

        public Criteria andTargetIdEqualTo(Integer value) {
            addCriterion("target_id =", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotEqualTo(Integer value) {
            addCriterion("target_id <>", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdGreaterThan(Integer value) {
            addCriterion("target_id >", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_id >=", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLessThan(Integer value) {
            addCriterion("target_id <", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLessThanOrEqualTo(Integer value) {
            addCriterion("target_id <=", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdIn(List<Integer> values) {
            addCriterion("target_id in", values, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotIn(List<Integer> values) {
            addCriterion("target_id not in", values, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdBetween(Integer value1, Integer value2) {
            addCriterion("target_id between", value1, value2, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("target_id not between", value1, value2, "targetId");
            return (Criteria) this;
        }

        public Criteria andCommentImg1IsNull() {
            addCriterion("comment_img1 is null");
            return (Criteria) this;
        }

        public Criteria andCommentImg1IsNotNull() {
            addCriterion("comment_img1 is not null");
            return (Criteria) this;
        }

        public Criteria andCommentImg1EqualTo(String value) {
            addCriterion("comment_img1 =", value, "commentImg1");
            return (Criteria) this;
        }

        public Criteria andCommentImg1NotEqualTo(String value) {
            addCriterion("comment_img1 <>", value, "commentImg1");
            return (Criteria) this;
        }

        public Criteria andCommentImg1GreaterThan(String value) {
            addCriterion("comment_img1 >", value, "commentImg1");
            return (Criteria) this;
        }

        public Criteria andCommentImg1GreaterThanOrEqualTo(String value) {
            addCriterion("comment_img1 >=", value, "commentImg1");
            return (Criteria) this;
        }

        public Criteria andCommentImg1LessThan(String value) {
            addCriterion("comment_img1 <", value, "commentImg1");
            return (Criteria) this;
        }

        public Criteria andCommentImg1LessThanOrEqualTo(String value) {
            addCriterion("comment_img1 <=", value, "commentImg1");
            return (Criteria) this;
        }

        public Criteria andCommentImg1Like(String value) {
            addCriterion("comment_img1 like", value, "commentImg1");
            return (Criteria) this;
        }

        public Criteria andCommentImg1NotLike(String value) {
            addCriterion("comment_img1 not like", value, "commentImg1");
            return (Criteria) this;
        }

        public Criteria andCommentImg1In(List<String> values) {
            addCriterion("comment_img1 in", values, "commentImg1");
            return (Criteria) this;
        }

        public Criteria andCommentImg1NotIn(List<String> values) {
            addCriterion("comment_img1 not in", values, "commentImg1");
            return (Criteria) this;
        }

        public Criteria andCommentImg1Between(String value1, String value2) {
            addCriterion("comment_img1 between", value1, value2, "commentImg1");
            return (Criteria) this;
        }

        public Criteria andCommentImg1NotBetween(String value1, String value2) {
            addCriterion("comment_img1 not between", value1, value2, "commentImg1");
            return (Criteria) this;
        }

        public Criteria andCommentImg2IsNull() {
            addCriterion("comment_img2 is null");
            return (Criteria) this;
        }

        public Criteria andCommentImg2IsNotNull() {
            addCriterion("comment_img2 is not null");
            return (Criteria) this;
        }

        public Criteria andCommentImg2EqualTo(String value) {
            addCriterion("comment_img2 =", value, "commentImg2");
            return (Criteria) this;
        }

        public Criteria andCommentImg2NotEqualTo(String value) {
            addCriterion("comment_img2 <>", value, "commentImg2");
            return (Criteria) this;
        }

        public Criteria andCommentImg2GreaterThan(String value) {
            addCriterion("comment_img2 >", value, "commentImg2");
            return (Criteria) this;
        }

        public Criteria andCommentImg2GreaterThanOrEqualTo(String value) {
            addCriterion("comment_img2 >=", value, "commentImg2");
            return (Criteria) this;
        }

        public Criteria andCommentImg2LessThan(String value) {
            addCriterion("comment_img2 <", value, "commentImg2");
            return (Criteria) this;
        }

        public Criteria andCommentImg2LessThanOrEqualTo(String value) {
            addCriterion("comment_img2 <=", value, "commentImg2");
            return (Criteria) this;
        }

        public Criteria andCommentImg2Like(String value) {
            addCriterion("comment_img2 like", value, "commentImg2");
            return (Criteria) this;
        }

        public Criteria andCommentImg2NotLike(String value) {
            addCriterion("comment_img2 not like", value, "commentImg2");
            return (Criteria) this;
        }

        public Criteria andCommentImg2In(List<String> values) {
            addCriterion("comment_img2 in", values, "commentImg2");
            return (Criteria) this;
        }

        public Criteria andCommentImg2NotIn(List<String> values) {
            addCriterion("comment_img2 not in", values, "commentImg2");
            return (Criteria) this;
        }

        public Criteria andCommentImg2Between(String value1, String value2) {
            addCriterion("comment_img2 between", value1, value2, "commentImg2");
            return (Criteria) this;
        }

        public Criteria andCommentImg2NotBetween(String value1, String value2) {
            addCriterion("comment_img2 not between", value1, value2, "commentImg2");
            return (Criteria) this;
        }

        public Criteria andCommentImg3IsNull() {
            addCriterion("comment_img3 is null");
            return (Criteria) this;
        }

        public Criteria andCommentImg3IsNotNull() {
            addCriterion("comment_img3 is not null");
            return (Criteria) this;
        }

        public Criteria andCommentImg3EqualTo(String value) {
            addCriterion("comment_img3 =", value, "commentImg3");
            return (Criteria) this;
        }

        public Criteria andCommentImg3NotEqualTo(String value) {
            addCriterion("comment_img3 <>", value, "commentImg3");
            return (Criteria) this;
        }

        public Criteria andCommentImg3GreaterThan(String value) {
            addCriterion("comment_img3 >", value, "commentImg3");
            return (Criteria) this;
        }

        public Criteria andCommentImg3GreaterThanOrEqualTo(String value) {
            addCriterion("comment_img3 >=", value, "commentImg3");
            return (Criteria) this;
        }

        public Criteria andCommentImg3LessThan(String value) {
            addCriterion("comment_img3 <", value, "commentImg3");
            return (Criteria) this;
        }

        public Criteria andCommentImg3LessThanOrEqualTo(String value) {
            addCriterion("comment_img3 <=", value, "commentImg3");
            return (Criteria) this;
        }

        public Criteria andCommentImg3Like(String value) {
            addCriterion("comment_img3 like", value, "commentImg3");
            return (Criteria) this;
        }

        public Criteria andCommentImg3NotLike(String value) {
            addCriterion("comment_img3 not like", value, "commentImg3");
            return (Criteria) this;
        }

        public Criteria andCommentImg3In(List<String> values) {
            addCriterion("comment_img3 in", values, "commentImg3");
            return (Criteria) this;
        }

        public Criteria andCommentImg3NotIn(List<String> values) {
            addCriterion("comment_img3 not in", values, "commentImg3");
            return (Criteria) this;
        }

        public Criteria andCommentImg3Between(String value1, String value2) {
            addCriterion("comment_img3 between", value1, value2, "commentImg3");
            return (Criteria) this;
        }

        public Criteria andCommentImg3NotBetween(String value1, String value2) {
            addCriterion("comment_img3 not between", value1, value2, "commentImg3");
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