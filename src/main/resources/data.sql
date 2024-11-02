/* Como no estoy seguro que PRICE_LIST sea una clave primaria para la tabla le añado mi propio idenficador */
CREATE TABLE IF NOT EXISTS PRICES (
    ID INT PRIMARY KEY,
    BRAND_ID INT,
    START_DATE TIMESTAMP,
    END_DATE TIMESTAMP,
    PRICE_LIST INT,
    PRODUCT_ID INT,
    PRIORITY INT,
    PRICE DECIMAL(10, 2),
    CURRENCY VARCHAR(3)
);

INSERT INTO PRICES(ID, BRAND_ID, START_DATE, END_DATE, PRICE_LIST, PRODUCT_ID, PRIORITY, PRICE, CURRENCY)
VALUES
    (1,1, '2020-06-14T00:00:00', '2020-12-31T23:59:59', 1, 35455, 0, 35.50, 'EUR');

INSERT INTO PRICES(id,brand_id, start_date, end_date, price_list, product_id, priority, price, currency)
VALUES
    (2,1, '2020-06-14T15:00:00', '2020-06-14T18:30:00', 2, 35455, 1, 25.45, 'EUR');

INSERT INTO PRICES(id,brand_id, start_date, end_date, price_list, product_id, priority, price, currency)
VALUES
    (3,1, '2020-06-15T00:00:00', '2020-06-15T11:00:00', 3, 35455, 1, 30.50, 'EUR');

INSERT INTO PRICES(id,brand_id, start_date, end_date, price_list, product_id, priority, price, currency)
VALUES
    (4,1, '2020-06-15T16:00:00', '2020-12-31T23:59:59', 4, 35455, 1, 38.95, 'EUR');