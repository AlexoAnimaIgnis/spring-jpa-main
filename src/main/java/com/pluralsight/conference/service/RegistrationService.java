package com.pluralsight.conference.service;

import com.pluralsight.conference.model.Registration;

import java.util.List;

public interface RegistrationService {
    Registration addRegistration(Registration registration);

    List<Registration> findAll();
}
