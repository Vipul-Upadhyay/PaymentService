# PaymentService
PaymentService is a Spring Boot application that provides payment processing functionalities using Razorpay and Stripe payment gateways.
## Features
- Integration with Razorpay and Stripe payment gateways
- RESTful API for initiating payments
- Webhook endpoint for Stripe events
## Requirements
- Java 17
- Maven
- MySQL
## Getting Started
Clone the repository
```sh
git clone https://github.com/yourusername/PaymentService.git
cd PaymentService
```
Configuration
Update the application.properties file with your Razorpay and Stripe credentials.
```sh
# Razorpay
razorpay.key.id=your_razorpay_key_id
razorpay.key.secret=your_razorpay_key_secret

# Stripe
stripe.api.key=your_stripe_api_key
```
### Build and Run
```sh
mvn clean install
mvn spring-boot:run
```
### API Endpoints
#### Initiate Payment
``` sh
POST /payments/initiate
```
#### Stripe Webhook
```sh
POST /stripeWebhook
```
## Dependencies
- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- Spring Boot DevTools
- MySQL Connector/J
- Spring Boot Configuration Processor
- Lombok
- Spring Boot Starter Test
- Razorpay Java SDK
- Stripe Java SDK
## License
This project is licensed under the MIT License. See the LICENSE file for details.
