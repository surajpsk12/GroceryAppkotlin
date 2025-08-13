# 🛒 GroceryApplications

> **A simple Android application for displaying a list of grocery items. Features a custom adapter to showcase items with images, titles, and descriptions in a RecyclerView.**

---
---
App Download Link : https://drive.google.com/file/d/1hplvg_ZFTZuBUJxXYpXRhqYLb0PPKXt2/view?usp=sharing
---
## 🚀 Features

- 📜 **Grocery Item Display:** Shows a list of grocery items.
- 🖼️ **Rich Item View:** Each item in the list can display an image, a title (name), and a description.
- 📱 
**RecyclerView Implementation:** Uses `RecyclerView` for efficient list display.
- ✨ **Custom Adapter:** `MyAdapter.kt` handles data binding to the custom item layout (`item_layout.xml`).
- 👆 **Item Interaction:** Shows a `Toast` message when an item in the list is clicked, indicating the chosen item.

---

## 🛠️ Tech Stack

- **Language:** Kotlin
- **UI:** XML
- **Core Components:** Android SDK (Activities, `RecyclerView`, Custom Adapters, `ImageView`, `TextView`)

---

## 📁 Project Structure (Simplified)




```
com.surajvanshsv.groceryapplications/  
├── MyAdapter.kt                # Custom RecyclerView adapter
├── ItemModel.kt                # Data model for grocery items
├── MainActivity.kt             # Main activity displaying the grocery list
├── res/
│   ├── layout/
│   │   ├── activity_main.xml   # Layout for the main activity (contains RecyclerView)
│   │   └── item_layout.xml     # Custom layout for a single grocery item
│   ├── drawable/               # Drawable resources (e.g., item images)
│   └── values/                 # colors.xml, strings.xml, styles.xml
└── AndroidManifest.xml


```






---

## ⚙️ Installation & Run

1.  **Clone this repo:**
    


```
git clone https://github.com/surajpsk12/GroceryAppkotlin.git
    cd GroceryAppkotlin
```




2.  **Open in Android Studio.**

3.  **Run the app on an emulator or physical device.**

---

## ✨ Future Enhancements

*   ✅ Add functionality to add, edit, or delete grocery items.
*   ✅ Persist grocery list data (e.g., using Room, SharedPreferences, or Firebase).
*   ✅ Categorize grocery items.
*   ✅ Mark items as "purchased" or "in cart".
*   ✅ Search and filter grocery items.
*   ✅ Implement data binding.

---

## 🤝 Contribution

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change or improve.

---

## 📜 License

MIT © 2024 [Suraj Kumar](https://github.com/surajpsk12)

---

## 🌐 Connect With Me

*   🔗 [LinkedIn - Suraj Kumar](https://www.linkedin.com/in/surajvansh12/)
*   💻 [GitHub - surajpsk12](https://github.com/surajpsk12)
