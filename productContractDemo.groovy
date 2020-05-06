import org.springframework.cloud.contract.spec.Contract

Contract.make {
    //ignored()
    request {
        method 'GET'
        urlPath('/product') {
            queryParameters {
                parameter('id', 537)
            }
        }
    }
    response {
        status 200
        body(
                '''
                {
                    "id": "1",
                    "name": "Honey"
                }
                '''
        )
        headers {
            header('Content-Type', 'application/json')
        }
    }
}
