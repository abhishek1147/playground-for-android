package io.appwrite.services;
import io.appwrite.Client;

abstract class Service {
    final Client client;

    Service(Client client) {
        this.client = client;
    }
}