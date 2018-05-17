package com.ro.clarkewright.model;

/**
 *
 */
public class Route {

    private DistanceMatrix distanceMatrix;
    private Node depot;
    private Node destination;

    private double distance;
    private double totalDistance;

    /**
     * Starting by two nodes, calculate the distances roundtrip
     * @param depot
     * @param destination
     * @param distanceMatrix
     */
    public Route(Node depot, Node destination, DistanceMatrix distanceMatrix){
        this.distanceMatrix = distanceMatrix;
        this.depot = depot;
        this.destination = destination;

        this.distance = distanceMatrix.getDistance(depot, destination);
        this.totalDistance = distance * 2; // Andata e ritorno

    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double totalDistance) {
        this.distance = totalDistance;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public Node getDestination() {
        return destination;
    }

    public void setDestination(Node destination) {
        this.destination = destination;
    }

    public Node getDepot() {
        return depot;
    }

    public void setDepot(Node depot) {
        this.depot = depot;
    }
}
