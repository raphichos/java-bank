# Java Bank – Financial Transaction Control App

A simple financial transaction control system built in Java.  
The application demonstrates modeling of accounts, investments, and transaction history with a focus on **encapsulation, inheritance, and polymorphism**.

---

## Features
- Create bank accounts with **Pix keys**
- Perform deposits, withdrawals, and transfers
- Manage investment accounts linked to user wallets
- Maintain an **auditable transaction history** with timestamps
- Use repositories to separate persistence logic
- Store all values in **centavos** to avoid floating-point errors

---

## Tech & Tools
- **Java 21** (Gradle project)
- **Lombok** for reducing boilerplate (getters, equals/hashCode, toString)
- **Collections Framework** (`List`, `Map`, `Stream`)
- **Date/Time API** (`OffsetDateTime`, `ChronoUnit`)

---

## 📂 Project Structure
```bash
com.raphael
├── model        // Core domain classes (Wallet, AccountWallet, Investment, Money, etc.)
├── repository   // Repositories for accounts and investments
├── exception    // Custom exceptions (Pix in use, insufficient funds, account not found)
└── Main.java    // Entry point with a simple CLI
```

---

## Getting Started

### Prerequisites
- Java 21+
- Gradle

### Build & Run
```bash
# clone the repository
git clone git@github.com:raphichos/java-bank.git
cd java-bank

# build
./gradlew build

# run
./gradlew run
