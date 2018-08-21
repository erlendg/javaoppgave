# javaoppgave

Jax-rs REST web-service

POST to ...javaoppgave/webapi/agreements takes JSON with the following format:
    {
        "firstName": "john",
        "lastName": "doe",
        "email": "john@doe.com",
        "phone": "00000000",
        "mobile": "99999999",
        "type": "Car",
        "details": "Details"
    }
    
    and returns JSON:
    {
        "customernumber": 1,
        "details": "Details",
        "id": 1,
        "links": [],
        "status": "Sent",
        "type": "Car"
    }
