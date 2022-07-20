package com.assignment.passenger.flightbooking.model;

public class Flight {
    private Long flightNo;
    private String carrierName;
    private String flightModel;
    private Long seatCapacity;

    public Flight() {
    }

    public Flight(Long flightNo, String carrierName, String flightModel, Long seatCapacity) {
        this.flightNo = flightNo;
        this.carrierName = carrierName;
        this.flightModel = flightModel;
        this.seatCapacity = seatCapacity;
    }

    @Override
    public String   toString() {
        return "Flight{" +
                "flightNo=" + flightNo +
                ", carrierName='" + carrierName + '\'' +
                ", flightModel='" + flightModel + '\'' +
                ", seatCapacity=" + seatCapacity +
                '}';
    }

    public Long getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(Long flightNo) {
        this.flightNo = flightNo;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getFlightModel() {
        return flightModel;
    }

    public void setFlightModel(String flightModel) {
        this.flightModel = flightModel;
    }

    public Long getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(Long seatCapacity) {
        this.seatCapacity = seatCapacity;
    }
}
