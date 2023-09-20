package com.lina.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameExample() {
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

        public Criteria andGameIdIsNull() {
            addCriterion("gameId is null");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNotNull() {
            addCriterion("gameId is not null");
            return (Criteria) this;
        }

        public Criteria andGameIdEqualTo(Integer value) {
            addCriterion("gameId =", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotEqualTo(Integer value) {
            addCriterion("gameId <>", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThan(Integer value) {
            addCriterion("gameId >", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gameId >=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThan(Integer value) {
            addCriterion("gameId <", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThanOrEqualTo(Integer value) {
            addCriterion("gameId <=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdIn(List<Integer> values) {
            addCriterion("gameId in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotIn(List<Integer> values) {
            addCriterion("gameId not in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdBetween(Integer value1, Integer value2) {
            addCriterion("gameId between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gameId not between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameDateIsNull() {
            addCriterion("gameDate is null");
            return (Criteria) this;
        }

        public Criteria andGameDateIsNotNull() {
            addCriterion("gameDate is not null");
            return (Criteria) this;
        }

        public Criteria andGameDateEqualTo(Date value) {
            addCriterion("gameDate =", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateNotEqualTo(Date value) {
            addCriterion("gameDate <>", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateGreaterThan(Date value) {
            addCriterion("gameDate >", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateGreaterThanOrEqualTo(Date value) {
            addCriterion("gameDate >=", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateLessThan(Date value) {
            addCriterion("gameDate <", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateLessThanOrEqualTo(Date value) {
            addCriterion("gameDate <=", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateIn(List<Date> values) {
            addCriterion("gameDate in", values, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateNotIn(List<Date> values) {
            addCriterion("gameDate not in", values, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateBetween(Date value1, Date value2) {
            addCriterion("gameDate between", value1, value2, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateNotBetween(Date value1, Date value2) {
            addCriterion("gameDate not between", value1, value2, "gameDate");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdIsNull() {
            addCriterion("homeTeamId is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdIsNotNull() {
            addCriterion("homeTeamId is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdEqualTo(Integer value) {
            addCriterion("homeTeamId =", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdNotEqualTo(Integer value) {
            addCriterion("homeTeamId <>", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdGreaterThan(Integer value) {
            addCriterion("homeTeamId >", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("homeTeamId >=", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdLessThan(Integer value) {
            addCriterion("homeTeamId <", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("homeTeamId <=", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdIn(List<Integer> values) {
            addCriterion("homeTeamId in", values, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdNotIn(List<Integer> values) {
            addCriterion("homeTeamId not in", values, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("homeTeamId between", value1, value2, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("homeTeamId not between", value1, value2, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreIsNull() {
            addCriterion("homeTeamScore is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreIsNotNull() {
            addCriterion("homeTeamScore is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreEqualTo(Integer value) {
            addCriterion("homeTeamScore =", value, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreNotEqualTo(Integer value) {
            addCriterion("homeTeamScore <>", value, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreGreaterThan(Integer value) {
            addCriterion("homeTeamScore >", value, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("homeTeamScore >=", value, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreLessThan(Integer value) {
            addCriterion("homeTeamScore <", value, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreLessThanOrEqualTo(Integer value) {
            addCriterion("homeTeamScore <=", value, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreIn(List<Integer> values) {
            addCriterion("homeTeamScore in", values, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreNotIn(List<Integer> values) {
            addCriterion("homeTeamScore not in", values, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreBetween(Integer value1, Integer value2) {
            addCriterion("homeTeamScore between", value1, value2, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("homeTeamScore not between", value1, value2, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdIsNull() {
            addCriterion("visitingTeamId is null");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdIsNotNull() {
            addCriterion("visitingTeamId is not null");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdEqualTo(Integer value) {
            addCriterion("visitingTeamId =", value, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdNotEqualTo(Integer value) {
            addCriterion("visitingTeamId <>", value, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdGreaterThan(Integer value) {
            addCriterion("visitingTeamId >", value, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitingTeamId >=", value, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdLessThan(Integer value) {
            addCriterion("visitingTeamId <", value, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("visitingTeamId <=", value, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdIn(List<Integer> values) {
            addCriterion("visitingTeamId in", values, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdNotIn(List<Integer> values) {
            addCriterion("visitingTeamId not in", values, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("visitingTeamId between", value1, value2, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("visitingTeamId not between", value1, value2, "visitingTeamId");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamScoreIsNull() {
            addCriterion("visitingTeamScore is null");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamScoreIsNotNull() {
            addCriterion("visitingTeamScore is not null");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamScoreEqualTo(Integer value) {
            addCriterion("visitingTeamScore =", value, "visitingTeamScore");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamScoreNotEqualTo(Integer value) {
            addCriterion("visitingTeamScore <>", value, "visitingTeamScore");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamScoreGreaterThan(Integer value) {
            addCriterion("visitingTeamScore >", value, "visitingTeamScore");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("visitingTeamScore >=", value, "visitingTeamScore");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamScoreLessThan(Integer value) {
            addCriterion("visitingTeamScore <", value, "visitingTeamScore");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamScoreLessThanOrEqualTo(Integer value) {
            addCriterion("visitingTeamScore <=", value, "visitingTeamScore");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamScoreIn(List<Integer> values) {
            addCriterion("visitingTeamScore in", values, "visitingTeamScore");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamScoreNotIn(List<Integer> values) {
            addCriterion("visitingTeamScore not in", values, "visitingTeamScore");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamScoreBetween(Integer value1, Integer value2) {
            addCriterion("visitingTeamScore between", value1, value2, "visitingTeamScore");
            return (Criteria) this;
        }

        public Criteria andVisitingTeamScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("visitingTeamScore not between", value1, value2, "visitingTeamScore");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("typeId =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("typeId <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("typeId >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeId >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("typeId <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("typeId <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("typeId in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("typeId not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("typeId between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("typeId not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("isDel is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("isDel is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("isDel =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("isDel <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("isDel >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDel >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("isDel <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("isDel <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("isDel in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("isDel not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("isDel between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("isDel not between", value1, value2, "isDel");
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