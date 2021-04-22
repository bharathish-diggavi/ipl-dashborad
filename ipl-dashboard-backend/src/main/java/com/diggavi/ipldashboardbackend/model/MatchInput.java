
package com.diggavi.ipldashboardbackend.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "city", "date", "player_of_match", "venue", "neutral_venue", "team1", "team2", "toss_winner",
        "toss_decision", "winner", "result", "result_margin", "eliminator", "method", "umpire1", "umpire2" })
@Generated("jsonschema2pojo")
public class MatchInput {

    @JsonProperty("id")
    private String id;
    @JsonProperty("city")
    private String city;
    @JsonProperty("date")
    private String date;
    @JsonProperty("player_of_match")
    private String playerOfMatch;
    @JsonProperty("venue")
    private String venue;
    @JsonProperty("neutral_venue")
    private String neutralVenue;
    @JsonProperty("team1")
    private String team1;
    @JsonProperty("team2")
    private String team2;
    @JsonProperty("toss_winner")
    private String tossWinner;
    @JsonProperty("toss_decision")
    private String tossDecision;
    @JsonProperty("winner")
    private String winner;
    @JsonProperty("result")
    private String result;
    @JsonProperty("result_margin")
    private String resultMargin;
    @JsonProperty("eliminator")
    private String eliminator;
    @JsonProperty("method")
    private String method;
    @JsonProperty("umpire1")
    private String umpire1;
    @JsonProperty("umpire2")
    private String umpire2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("player_of_match")
    public String getPlayerOfMatch() {
        return playerOfMatch;
    }

    @JsonProperty("player_of_match")
    public void setPlayerOfMatch(String playerOfMatch) {
        this.playerOfMatch = playerOfMatch;
    }

    @JsonProperty("venue")
    public String getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(String venue) {
        this.venue = venue;
    }

    @JsonProperty("neutral_venue")
    public String getNeutralVenue() {
        return neutralVenue;
    }

    @JsonProperty("neutral_venue")
    public void setNeutralVenue(String neutralVenue) {
        this.neutralVenue = neutralVenue;
    }

    @JsonProperty("team1")
    public String getTeam1() {
        return team1;
    }

    @JsonProperty("team1")
    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    @JsonProperty("team2")
    public String getTeam2() {
        return team2;
    }

    @JsonProperty("team2")
    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    @JsonProperty("toss_winner")
    public String getTossWinner() {
        return tossWinner;
    }

    @JsonProperty("toss_winner")
    public void setTossWinner(String tossWinner) {
        this.tossWinner = tossWinner;
    }

    @JsonProperty("toss_decision")
    public String getTossDecision() {
        return tossDecision;
    }

    @JsonProperty("toss_decision")
    public void setTossDecision(String tossDecision) {
        this.tossDecision = tossDecision;
    }

    @JsonProperty("winner")
    public String getWinner() {
        return winner;
    }

    @JsonProperty("winner")
    public void setWinner(String winner) {
        this.winner = winner;
    }

    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    @JsonProperty("result_margin")
    public String getResultMargin() {
        return resultMargin;
    }

    @JsonProperty("result_margin")
    public void setResultMargin(String resultMargin) {
        this.resultMargin = resultMargin;
    }

    @JsonProperty("eliminator")
    public String getEliminator() {
        return eliminator;
    }

    @JsonProperty("eliminator")
    public void setEliminator(String eliminator) {
        this.eliminator = eliminator;
    }

    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

    @JsonProperty("method")
    public void setMethod(String method) {
        this.method = method;
    }

    @JsonProperty("umpire1")
    public String getUmpire1() {
        return umpire1;
    }

    @JsonProperty("umpire1")
    public void setUmpire1(String umpire1) {
        this.umpire1 = umpire1;
    }

    @JsonProperty("umpire2")
    public String getUmpire2() {
        return umpire2;
    }

    @JsonProperty("umpire2")
    public void setUmpire2(String umpire2) {
        this.umpire2 = umpire2;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MatchInput.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null) ? "<null>" : this.city));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null) ? "<null>" : this.date));
        sb.append(',');
        sb.append("playerOfMatch");
        sb.append('=');
        sb.append(((this.playerOfMatch == null) ? "<null>" : this.playerOfMatch));
        sb.append(',');
        sb.append("venue");
        sb.append('=');
        sb.append(((this.venue == null) ? "<null>" : this.venue));
        sb.append(',');
        sb.append("neutralVenue");
        sb.append('=');
        sb.append(((this.neutralVenue == null) ? "<null>" : this.neutralVenue));
        sb.append(',');
        sb.append("team1");
        sb.append('=');
        sb.append(((this.team1 == null) ? "<null>" : this.team1));
        sb.append(',');
        sb.append("team2");
        sb.append('=');
        sb.append(((this.team2 == null) ? "<null>" : this.team2));
        sb.append(',');
        sb.append("tossWinner");
        sb.append('=');
        sb.append(((this.tossWinner == null) ? "<null>" : this.tossWinner));
        sb.append(',');
        sb.append("tossDecision");
        sb.append('=');
        sb.append(((this.tossDecision == null) ? "<null>" : this.tossDecision));
        sb.append(',');
        sb.append("winner");
        sb.append('=');
        sb.append(((this.winner == null) ? "<null>" : this.winner));
        sb.append(',');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null) ? "<null>" : this.result));
        sb.append(',');
        sb.append("resultMargin");
        sb.append('=');
        sb.append(((this.resultMargin == null) ? "<null>" : this.resultMargin));
        sb.append(',');
        sb.append("eliminator");
        sb.append('=');
        sb.append(((this.eliminator == null) ? "<null>" : this.eliminator));
        sb.append(',');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null) ? "<null>" : this.method));
        sb.append(',');
        sb.append("umpire1");
        sb.append('=');
        sb.append(((this.umpire1 == null) ? "<null>" : this.umpire1));
        sb.append(',');
        sb.append("umpire2");
        sb.append('=');
        sb.append(((this.umpire2 == null) ? "<null>" : this.umpire2));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.date == null) ? 0 : this.date.hashCode()));
        result = ((result * 31) + ((this.venue == null) ? 0 : this.venue.hashCode()));
        result = ((result * 31) + ((this.tossDecision == null) ? 0 : this.tossDecision.hashCode()));
        result = ((result * 31) + ((this.tossWinner == null) ? 0 : this.tossWinner.hashCode()));
        result = ((result * 31) + ((this.playerOfMatch == null) ? 0 : this.playerOfMatch.hashCode()));
        result = ((result * 31) + ((this.method == null) ? 0 : this.method.hashCode()));
        result = ((result * 31) + ((this.city == null) ? 0 : this.city.hashCode()));
        result = ((result * 31) + ((this.eliminator == null) ? 0 : this.eliminator.hashCode()));
        result = ((result * 31) + ((this.team1 == null) ? 0 : this.team1.hashCode()));
        result = ((result * 31) + ((this.team2 == null) ? 0 : this.team2.hashCode()));
        result = ((result * 31) + ((this.result == null) ? 0 : this.result.hashCode()));
        result = ((result * 31) + ((this.neutralVenue == null) ? 0 : this.neutralVenue.hashCode()));
        result = ((result * 31) + ((this.winner == null) ? 0 : this.winner.hashCode()));
        result = ((result * 31) + ((this.resultMargin == null) ? 0 : this.resultMargin.hashCode()));
        result = ((result * 31) + ((this.umpire1 == null) ? 0 : this.umpire1.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.umpire2 == null) ? 0 : this.umpire2.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MatchInput) == false) {
            return false;
        }
        MatchInput rhs = ((MatchInput) other);
        return (((((((((((((((((((this.date == rhs.date) || ((this.date != null) && this.date.equals(rhs.date)))
                && ((this.venue == rhs.venue) || ((this.venue != null) && this.venue.equals(rhs.venue))))
                && ((this.tossDecision == rhs.tossDecision)
                        || ((this.tossDecision != null) && this.tossDecision.equals(rhs.tossDecision))))
                && ((this.tossWinner == rhs.tossWinner)
                        || ((this.tossWinner != null) && this.tossWinner.equals(rhs.tossWinner))))
                && ((this.playerOfMatch == rhs.playerOfMatch)
                        || ((this.playerOfMatch != null) && this.playerOfMatch.equals(rhs.playerOfMatch))))
                && ((this.method == rhs.method) || ((this.method != null) && this.method.equals(rhs.method))))
                && ((this.city == rhs.city) || ((this.city != null) && this.city.equals(rhs.city))))
                && ((this.eliminator == rhs.eliminator)
                        || ((this.eliminator != null) && this.eliminator.equals(rhs.eliminator))))
                && ((this.team1 == rhs.team1) || ((this.team1 != null) && this.team1.equals(rhs.team1))))
                && ((this.team2 == rhs.team2) || ((this.team2 != null) && this.team2.equals(rhs.team2))))
                && ((this.result == rhs.result) || ((this.result != null) && this.result.equals(rhs.result))))
                && ((this.neutralVenue == rhs.neutralVenue)
                        || ((this.neutralVenue != null) && this.neutralVenue.equals(rhs.neutralVenue))))
                && ((this.winner == rhs.winner) || ((this.winner != null) && this.winner.equals(rhs.winner))))
                && ((this.resultMargin == rhs.resultMargin)
                        || ((this.resultMargin != null) && this.resultMargin.equals(rhs.resultMargin))))
                && ((this.umpire1 == rhs.umpire1) || ((this.umpire1 != null) && this.umpire1.equals(rhs.umpire1))))
                && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
                && ((this.umpire2 == rhs.umpire2) || ((this.umpire2 != null) && this.umpire2.equals(rhs.umpire2))))
                && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null)
                        && this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
