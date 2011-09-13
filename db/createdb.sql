CREATE TABLE Customer(
       id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
       tlf VARCHAR(20),
       name VARCHAR(30),
       address VARCHAR(30)
);

CREATE TABLE Orderr( -- Order is a reserved word :(
       id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
       customerId INT,
       beDelivered BOOLEAN,
       isDelivered BOOLEAN,
       isTaken BOOLEAN,
       CONSTRAINT FOREIGN KEY (customerId) REFERENCES Customer (id)
);

CREATE TABLE Product(
       id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(30),
       price DOUBLE,
       comment VARCHAR(100)
);

CREATE TABLE OrderProduct(
       orderId INT NOT NULL,
       productId INT NOT NULL,
       CONSTRAINT FOREIGN KEY (orderId) REFERENCES Orderr (id),
       CONSTRAINT FOREIGN KEY (productId) REFERENCES Product (id),
       CONSTRAINT PRIMARY KEY (orderId, productId)
);