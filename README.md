# Design patterns application
Project that implements an example of each of the most important design patterns, applied to examples that could occur in a productive environmen.

### Factory pattern
In a financial environment, the Factory design pattern could be used to create different types of financial products, such as bank accounts, credit cards or loans: Suppose that a bank offers different types of bank accounts, such as savings accounts, checking accounts and investment accounts. We could create an AccountFactory class that is responsible for instantiating different types of bank accounts based on the specified type.

### Observer pattern
The Observer pattern is useful in the financial field to keep the different components of a financial system up to date with changes that occur in financial data, such as changes in stock prices, interest rates, or market fluctuations.
Let's imagine a financial system where there are investors interested in receiving notifications about changes in the price of a particular stock. We will implement the Observer pattern so that investors can subscribe to receive price updates and be notified when there are changes in the stock price.

### Strategy pattern
The Strategy pattern can be used in a financial context to implement different investment strategies, such as asset buying and selling strategies, portfolio management, asset allocation, etc.
We are going to implement a portfolio management system that uses different investment strategies to determine how to allocate funds between different types of assets, such as stocks, bonds and cash.

### Adapter pattern
It allows different interfaces or classes to be adapted so that they can work together in a compatible way. For example, let's assume that we have a third-party provider that offers stock quotes in a specific format, but our internal system expects to receive the quotes in a different format. We will use the Adapter pattern to adapt the quotes from the external provider to the format expected by our internal system.

### State pattern
The State pattern could be used to model the state of a bank account, since bank accounts often have different states, such as "active", "inactive", "frozen", etc. Depending on the status of the account, certain operations may be allowed or denied, such as deposits, withdrawals, transfers, etc.
We will implement the State pattern to model the status of a bank account, where the status can be "active", "inactive", or "frozen". Depending on the account status, certain transactions will be allowed or denied.

### Builder pattern
