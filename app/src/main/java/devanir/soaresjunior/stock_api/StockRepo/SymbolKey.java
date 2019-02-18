
package devanir.soaresjunior.stock_api.StockRepo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SymbolKey {

    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("companyName")
    @Expose
    private String companyName;
    @SerializedName("primaryExchange")
    @Expose
    private String primaryExchange;
    @SerializedName("sector")
    @Expose
    private String sector;
    @SerializedName("calculationPrice")
    @Expose
    private String calculationPrice;
    @SerializedName("open")
    @Expose
    private Double open;
    @SerializedName("openTime")
    @Expose
    private Integer openTime;
    @SerializedName("close")
    @Expose
    private Double close;
    @SerializedName("closeTime")
    @Expose
    private Integer closeTime;
    @SerializedName("high")
    @Expose
    private Double high;
    @SerializedName("low")
    @Expose
    private Double low;
    @SerializedName("latestPrice")
    @Expose
    private Double latestPrice;
    @SerializedName("latestSource")
    @Expose
    private String latestSource;
    @SerializedName("latestTime")
    @Expose
    private String latestTime;
    @SerializedName("latestUpdate")
    @Expose
    private Integer latestUpdate;
    @SerializedName("latestVolume")
    @Expose
    private Integer latestVolume;
    @SerializedName("iexRealtimePrice")
    @Expose
    private Object iexRealtimePrice;
    @SerializedName("iexRealtimeSize")
    @Expose
    private Object iexRealtimeSize;
    @SerializedName("iexLastUpdated")
    @Expose
    private Object iexLastUpdated;
    @SerializedName("delayedPrice")
    @Expose
    private Double delayedPrice;
    @SerializedName("delayedPriceTime")
    @Expose
    private Integer delayedPriceTime;
    @SerializedName("extendedPrice")
    @Expose
    private Integer extendedPrice;
    @SerializedName("extendedChange")
    @Expose
    private Double extendedChange;
    @SerializedName("extendedChangePercent")
    @Expose
    private Double extendedChangePercent;
    @SerializedName("extendedPriceTime")
    @Expose
    private Integer extendedPriceTime;
    @SerializedName("previousClose")
    @Expose
    private Double previousClose;
    @SerializedName("change")
    @Expose
    private Double change;
    @SerializedName("changePercent")
    @Expose
    private Double changePercent;
    @SerializedName("iexMarketPercent")
    @Expose
    private Object iexMarketPercent;
    @SerializedName("iexVolume")
    @Expose
    private Object iexVolume;
    @SerializedName("avgTotalVolume")
    @Expose
    private Integer avgTotalVolume;
    @SerializedName("iexBidPrice")
    @Expose
    private Object iexBidPrice;
    @SerializedName("iexBidSize")
    @Expose
    private Object iexBidSize;
    @SerializedName("iexAskPrice")
    @Expose
    private Object iexAskPrice;
    @SerializedName("iexAskSize")
    @Expose
    private Object iexAskSize;
    @SerializedName("marketCap")
    @Expose
    private Integer marketCap;
    @SerializedName("peRatio")
    @Expose
    private Double peRatio;
    @SerializedName("week52High")
    @Expose
    private Double week52High;
    @SerializedName("week52Low")
    @Expose
    private Integer week52Low;
    @SerializedName("ytdChange")
    @Expose
    private Double ytdChange;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPrimaryExchange() {
        return primaryExchange;
    }

    public void setPrimaryExchange(String primaryExchange) {
        this.primaryExchange = primaryExchange;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCalculationPrice() {
        return calculationPrice;
    }

    public void setCalculationPrice(String calculationPrice) {
        this.calculationPrice = calculationPrice;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Integer getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Integer openTime) {
        this.openTime = openTime;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public Integer getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Integer closeTime) {
        this.closeTime = closeTime;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }
    public void setLow(Double low) {
        this.low = low;
    }

    public Double getLatestPrice() {
        return latestPrice;
    }

    public void setLatestPrice(Double latestPrice) {
        this.latestPrice = latestPrice;
    }

    public String getLatestSource() {
        return latestSource;
    }

    public void setLatestSource(String latestSource) {
        this.latestSource = latestSource;
    }

    public String getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(String latestTime) {
        this.latestTime = latestTime;
    }

    public Integer getLatestUpdate() {
        return latestUpdate;
    }

    public void setLatestUpdate(Integer latestUpdate) {
        this.latestUpdate = latestUpdate;
    }

    public Integer getLatestVolume() {
        return latestVolume;
    }

    public void setLatestVolume(Integer latestVolume) {
        this.latestVolume = latestVolume;
    }

    public Object getIexRealtimePrice() {
        return iexRealtimePrice;
    }

    public void setIexRealtimePrice(Object iexRealtimePrice) {
        this.iexRealtimePrice = iexRealtimePrice;
    }

    public Object getIexRealtimeSize() {
        return iexRealtimeSize;
    }

    public void setIexRealtimeSize(Object iexRealtimeSize) {
        this.iexRealtimeSize = iexRealtimeSize;
    }

    public Object getIexLastUpdated() {
        return iexLastUpdated;
    }

    public void setIexLastUpdated(Object iexLastUpdated) {
        this.iexLastUpdated = iexLastUpdated;
    }

    public Double getDelayedPrice() {
        return delayedPrice;
    }

    public void setDelayedPrice(Double delayedPrice) {
        this.delayedPrice = delayedPrice;
    }

    public Integer getDelayedPriceTime() {
        return delayedPriceTime;
    }

    public void setDelayedPriceTime(Integer delayedPriceTime) {
        this.delayedPriceTime = delayedPriceTime;
    }

    public Integer getExtendedPrice() {
        return extendedPrice;
    }

    public void setExtendedPrice(Integer extendedPrice) {
        this.extendedPrice = extendedPrice;
    }

    public Double getExtendedChange() {
        return extendedChange;
    }

    public void setExtendedChange(Double extendedChange) {
        this.extendedChange = extendedChange;
    }

    public Double getExtendedChangePercent() {
        return extendedChangePercent;
    }

    public void setExtendedChangePercent(Double extendedChangePercent) {
        this.extendedChangePercent = extendedChangePercent;
    }

    public Integer getExtendedPriceTime() {
        return extendedPriceTime;
    }

    public void setExtendedPriceTime(Integer extendedPriceTime) {
        this.extendedPriceTime = extendedPriceTime;
    }

    public Double getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(Double previousClose) {
        this.previousClose = previousClose;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public Double getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(Double changePercent) {
        this.changePercent = changePercent;
    }

    public Object getIexMarketPercent() {
        return iexMarketPercent;
    }

    public void setIexMarketPercent(Object iexMarketPercent) {
        this.iexMarketPercent = iexMarketPercent;
    }

    public Object getIexVolume() {
        return iexVolume;
    }

    public void setIexVolume(Object iexVolume) {
        this.iexVolume = iexVolume;
    }

    public Integer getAvgTotalVolume() {
        return avgTotalVolume;
    }

    public void setAvgTotalVolume(Integer avgTotalVolume) {
        this.avgTotalVolume = avgTotalVolume;
    }

    public Object getIexBidPrice() {
        return iexBidPrice;
    }

    public void setIexBidPrice(Object iexBidPrice) {
        this.iexBidPrice = iexBidPrice;
    }

    public Object getIexBidSize() {
        return iexBidSize;
    }

    public void setIexBidSize(Object iexBidSize) {
        this.iexBidSize = iexBidSize;
    }

    public Object getIexAskPrice() {
        return iexAskPrice;
    }

    public void setIexAskPrice(Object iexAskPrice) {
        this.iexAskPrice = iexAskPrice;
    }

    public Object getIexAskSize() {
        return iexAskSize;
    }

    public void setIexAskSize(Object iexAskSize) {
        this.iexAskSize = iexAskSize;
    }

    public Integer getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Integer marketCap) {
        this.marketCap = marketCap;
    }

    public Double getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(Double peRatio) {
        this.peRatio = peRatio;
    }

    public Double getWeek52High() {
        return week52High;
    }

    public void setWeek52High(Double week52High) {
        this.week52High = week52High;
    }

    public Integer getWeek52Low() {
        return week52Low;
    }

    public void setWeek52Low(Integer week52Low) {
        this.week52Low = week52Low;
    }

    public Double getYtdChange() {
        return ytdChange;
    }

    public void setYtdChange(Double ytdChange) {
        this.ytdChange = ytdChange;
    }

}
