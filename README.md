<div align="center">

<img src="https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white"/>
<img src="https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
<img src="https://img.shields.io/badge/Firebase-Authentication-FFCA28?style=for-the-badge&logo=firebase&logoColor=black"/>
<img src="https://img.shields.io/badge/IDE-Android%20Studio-3DDC84?style=for-the-badge&logo=androidstudio&logoColor=white"/>

# 🥗 CureBites

### Smart Health Meal App for Android

*Personalized meal plans · Expert nutritionist guidance · Healthy food ordering*

[Figma Design](#-https://www.figma.com/design/Q1Gjpd9VCcNt3eJMRNLId2/Cure-Bites-Design?node-id=0-1&t=f7Uyw1csNpZY1O5D-0) · [🚀 Get Started](#-installation)

</div>

---

## 📖 About

**CureBites** is an Android application that helps users take control of their health through personalized meal planning, direct access to nutritionists, and a seamless healthy food ordering system. The app delivers a complete end-to-end user journey — from onboarding to real-time order tracking — all within a clean and intuitive interface.

---

## ✨ Features

| Feature | Description |
|---|---|
| 🔐 **Authentication** | Secure Firebase Email/Password Login & Signup |
| 🧑‍⚕️ **Nutritionist Connect** | Browse profiles and chat with certified nutritionists |
| 🥗 **Meal Plans** | Personalized plans with calendar-based scheduling |
| 🛒 **Food Ordering** | Browse healthy meals, add to cart, and checkout |
| 📦 **Order Tracking** | Live order status with step-by-step tracking UI |
| 📊 **Progress Monitoring** | Track your health journey over time |
| 🔔 **Notifications** | Stay updated with reminders and alerts |
| 📤 **Report Upload** | Upload and manage your health documents |

---

## 🚀 App Flow

```
Splash Screen
    └── Onboarding (3 Screens)
            └── Login / Signup
                    └── Tell Us About Yourself
                            └── 🏠 Home Dashboard
```

**From the Home Dashboard, users can navigate to:**

- 📤 Upload Reports
- 🥗 Meal Plans & Ordering Flow
- 👨‍⚕️ Nutritionist Consultation
- 🛒 Order History
- 📊 Progress Tracking
- 🔔 Notifications
- 👤 Profile

---

## 📱 Screens (22 Total)

<details>
<summary><b>🔐 Onboarding & Authentication (6 screens)</b></summary>

- Splash Screen
- Onboarding 1
- Onboarding 2
- Onboarding 3
- Login / Signup
- Tell Us About Yourself

</details>

<details>
<summary><b>🏠 Main Dashboard (1 screen)</b></summary>

- Home Screen

</details>

<details>
<summary><b>🥗 Meal Plan & Ordering Flow (8 screens)</b></summary>

- Choose Plan
- Meal Plan (Calendar)
- Recipe Details
- Add to Cart
- Checkout
- Order Placed
- Order Tracking

</details>

<details>
<summary><b>👨‍⚕️ Experts (2 screens)</b></summary>

- Nutritionist Profile
- Chat with Nutritionist

</details>

<details>
<summary><b>🛒 Orders · 📊 Progress · 🔔 Notifications · 👤 Profile · 📤 Upload (5 screens)</b></summary>

- Order History
- My Progress
- Notifications Page
- Profile Page
- Upload Reports

</details>

---

## 📸 Screenshots

| Splash Screen | Onboarding | Login |
|:---:|:---:|:---:|
| *(Add image)* | *(Add image)* | *(Add image)* |

| Home Dashboard | Meal Plans | Order Tracking |
|:---:|:---:|:---:|
| *(Add image)* | *(Add image)* | *(Add image)* |

---

## 🎨 UI/UX Design

> 👉 **Figma Design:** *(#-https://www.figma.com/design/Q1Gjpd9VCcNt3eJMRNLId2/Cure-Bites-Design?node-id=0-1&t=f7Uyw1csNpZY1O5D-0)*

---

## 🛠️ Tech Stack

| Category | Technology |
|---|---|
| **Language** | Java |
| **IDE** | Android Studio |
| **Authentication** | Firebase Authentication |
| **Database** | Firebase Firestore *(planned)* |
| **UI** | XML + Material Design |
| **Architecture** | Activity-based |

---

## ⚙️ Installation

**1. Clone the repository**
```bash
git clone https://github.com/your-username/curebites.git
```

**2. Open in Android Studio**
```
File → Open → Select the cloned folder
```

**3. Sync Gradle**
```
Click "Sync Now" when prompted, or go to File → Sync Project with Gradle Files
```

**4. Run the app**
```
Use an emulator (API 24+) or connect a physical Android device
```

---

## 🔑 Firebase Setup

1. Go to [Firebase Console](https://console.firebase.google.com/)
2. Create a new project
3. Register your Android app with your package name
4. Enable **Email/Password Authentication** under *Authentication → Sign-in method*
5. Download `google-services.json`
6. Place it inside the `app/` directory:

```
CureBites/
└── app/
    └── google-services.json   ← place here
```

---

---

## 💡 Future Enhancements

- [ ] 💳 Payment Gateway Integration
- [ ] 📍 Live Order Tracking with Google Maps
- [ ] 🤖 AI-based Meal Recommendations
- [ ] 📊 Advanced Health Analytics Dashboard
- [ ] 🌙 Dark Mode Support

---

## 👩‍💻 Author

**Sanjana Singh**

[![GitHub](https://img.shields.io/badge/GitHub-Follow-181717?style=flat&logo=github)](https://github.com/Sanjana2622)

---

## 🧠 Project Note

This project demonstrates a complete end-to-end Android application, integrating Firebase authentication, a personalized user onboarding experience, meal planning, and a food ordering system — all structured within a clean 22-screen UI design.

---

<div align="center">

⭐ **If you found this project helpful, please give it a star!** ⭐

</div>
