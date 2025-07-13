# 🚖 Smart Cab Pooling System

Smart Cab Pooling System is a **Java console-based application** that efficiently allocates rides to users based on **source and destination proximity** and **pickup time window**, simulating real-world cab pooling logic. It demonstrates **object-oriented programming, collections, and user input handling**.

---

## 🌟 Features

- 🚗 **Ride Request & Matching**  
  Users can request rides with pickup/drop details and get matched to existing ride pools based on route and time similarity.

- 🗃️ **Data Structures & Algorithms**  
  Uses **ArrayList** to store rides and applies matching logic with time window filtering.

- 👨‍💻 **Interactive CLI Application**  
  Menu-driven interface for requesting rides and viewing matches.

- 💡 **Clean Object-Oriented Design**  
  Implements modular classes (`Ride`, `RideService`, `Main`) demonstrating Java OOP principles.

---

## 🛠️ Tech Stack

- **Language:** Java
- **Concepts:** OOP (Classes, Objects), Collections (ArrayList), Time Conversion Logic, CLI Input Handling

---

## 🚦 How It Works

1. User runs the application and selects **“Request a Ride”**  
2. Inputs:
   - Pickup Location
   - Drop Location
   - Pickup Time (HH:MM)
   - Willingness to Share (yes/no)
3. Application checks existing rides for:
   - Same route (pickup & drop match)
   - Time window within **±15 minutes**
4. Displays matching ride pools or notifies if no match found  
5. Adds the new ride to the system for future matching

---

## 📸 Screenshots

![Home Menu](./screenshots/home.png)

### 🔹 Request a Ride
![Request Ride](./screenshots/request.png)

### 🔹  No Match Found
![No Match Found](./screenshots/matchfound.png)

### 🔹 Match Found
![Match Found](./screenshots/nomatch.png)

---

## 📁 Project Structure
Smart_Cab_Pooling/
┣ Main.java
┣ Ride.java
┣ RideService.java
┗ README.md
---

## ▶️ Getting Started

### ⚙️ Run the Program

1. **Clone the repository**

```bash
git clone https://github.com/yogesh5055/Smart_Cab_Pooling.git
cd SmartCabPooling
javac Main.java Ride.java RideService.java
java Main
