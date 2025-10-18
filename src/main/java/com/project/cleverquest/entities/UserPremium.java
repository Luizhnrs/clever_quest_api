package com.project.cleverquest.entities;

import java.time.LocalDate;

public class UserPremium extends User {

    private boolean isActive;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isFirstSubscription;

    public UserPremium() {
    }

    public UserPremium(Long id, String username, String email, Long coins, boolean isPremium,
                       String favoriteCategory, String imageUrl, boolean isActive, LocalDate startDate,
                       LocalDate endDate, boolean isFirstSubscription) {
        super(id, username, email, coins, isPremium, favoriteCategory, imageUrl);
        this.isActive = isActive;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isFirstSubscription = isFirstSubscription;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isFirstSubscription() {
        return isFirstSubscription;
    }

    public void setFirstSubscription(boolean firstSubscription) {
        isFirstSubscription = firstSubscription;
    }

    public void premiumIsActive(boolean isActive){
        while (isActive == true){
            setPremium(true);
        }
    }
}
