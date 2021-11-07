fun testAuth() {
    val manager = Manager(
        "Luiz",
        "123.456.789.10",
        1000.0,
        123456
    )

    val director = Director(
        "Reginaldo",
        "109.876.543.21",
        2000.0,
        654321,
        500.0
    )

    val customer = Customer(
        name = "Siva",
        documentNumber = "112.334.556-77",
        password = 123456
    )

    val intranet = Intranet()
    intranet.login(manager,123456)
    intranet.login(director,654521)
    intranet.login(customer, 123456)
}