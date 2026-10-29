Sql_injecyion_Detevtion
# 🛡️ SQL Injection Detection Using Machine Learning

A Flask-based web application that detects SQL Injection attacks using Machine Learning. The system analyzes user input and classifies SQL queries as either **Normal** or **Malicious**, helping improve the security of web applications against SQL Injection attacks.

---

## 📖 Project Overview

SQL Injection is one of the most common cyber attacks targeting web applications. This project leverages **Machine Learning** and **Natural Language Processing (NLP)** to automatically detect malicious SQL queries.

The application is built using **Flask** for the web interface and a trained **Random Forest Classifier** with **TF-IDF Vectorization** for accurate prediction.

---

## ✨ Features

- 🔒 Detects SQL Injection attacks in real time
- 🤖 Machine Learning-based prediction
- 🌐 User-friendly Flask web application
- 📊 TF-IDF feature extraction
- ⚡ Random Forest Classifier for prediction
- 💾 SQLite database integration
- 📦 Pre-trained model stored using Pickle
- 🛡️ Helps improve web application security

---

## 🛠️ Technologies Used

### Programming Language
- Python

### Machine Learning
- Scikit-learn
- Random Forest Classifier

### NLP
- TF-IDF Vectorizer

### Web Framework
- Flask

### Database
- SQLite

### Libraries
- Pandas
- NumPy
- Joblib / Pickle
- Scikit-learn
- Flask

---

## 📂 Project Structure

```text
SQL-Injection-Detection/
│
├── .github/
│   └── workflows/
│
├── templates/
│
├── app.py
├── train_pipeline.py
├── seed_users.py
├── pipeline.pkl
├── users.db
├── requirements.txt
├── pyvenv.cfg
└── README.md
```

---

## ⚙️ Working Process

1. Collect SQL query dataset.
2. Clean and preprocess the data.
3. Convert SQL queries into numerical features using TF-IDF.
4. Train the Random Forest Classifier.
5. Save the trained model as `pipeline.pkl`.
6. Launch the Flask web application.
7. Enter an SQL query.
8. The model predicts whether the query is **Normal** or an **SQL Injection Attack**.

---

## 🚀 Installation

### Clone the Repository

```bash
git clone https://github.com/shahida7135-code/SQL-Injection-Detection.git
```

### Move to the Project Directory

```bash
cd SQL-Injection-Detection
```

### Install Dependencies

```bash
pip install -r requirements.txt
```

### Run the Application

```bash
python app.py
```

The application will start on:

```
http://127.0.0.1:5000
```

---

## 📊 Sample Prediction

**Input Query**

```sql
SELECT * FROM users WHERE username='admin' OR '1'='1';
```

**Prediction**

```text
⚠️ SQL Injection Detected
```

---

## 🎯 Applications

- Web Application Security
- Cyber Security Research
- SQL Injection Detection
- Educational Projects
- Machine Learning-based Threat Detection

---

## 🔮 Future Enhancements

- Deep Learning models (LSTM/BERT)
- REST API support
- Cloud deployment (AWS/Render)
- Real-time monitoring dashboard
- Multi-language SQL support
- User authentication and logging

---

## 👩‍💻 Author

**T. Shahida Bhanu**

B.Tech – Computer Science and Engineering(Cyber Security)


## 📜 License

This project is developed for educational and learning purposes.

<!---LeetCode Topics Start-->
# LeetCode Topics
## Array
|  |
| ------- |
| [0001-two-sum](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0001-two-sum) |
| [0054-spiral-matrix](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0054-spiral-matrix) |
| [0130-surrounded-regions](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0130-surrounded-regions) |
| [0540-single-element-in-a-sorted-array](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0540-single-element-in-a-sorted-array) |
| [0744-find-smallest-letter-greater-than-target](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0744-find-smallest-letter-greater-than-target) |
| [1020-number-of-enclaves](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/1020-number-of-enclaves) |
| [3619-count-islands-with-total-value-divisible-by-k](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/3619-count-islands-with-total-value-divisible-by-k) |
## Depth-First Search
|  |
| ------- |
| [0130-surrounded-regions](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0130-surrounded-regions) |
| [0207-course-schedule](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0207-course-schedule) |
| [0210-course-schedule-ii](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0210-course-schedule-ii) |
| [0802-find-eventual-safe-states](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0802-find-eventual-safe-states) |
| [1020-number-of-enclaves](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/1020-number-of-enclaves) |
| [3619-count-islands-with-total-value-divisible-by-k](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/3619-count-islands-with-total-value-divisible-by-k) |
## Breadth-First Search
|  |
| ------- |
| [0130-surrounded-regions](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0130-surrounded-regions) |
| [0207-course-schedule](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0207-course-schedule) |
| [0210-course-schedule-ii](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0210-course-schedule-ii) |
| [0802-find-eventual-safe-states](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0802-find-eventual-safe-states) |
| [1020-number-of-enclaves](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/1020-number-of-enclaves) |
| [3619-count-islands-with-total-value-divisible-by-k](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/3619-count-islands-with-total-value-divisible-by-k) |
## Union-Find
|  |
| ------- |
| [0130-surrounded-regions](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0130-surrounded-regions) |
| [1020-number-of-enclaves](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/1020-number-of-enclaves) |
| [3619-count-islands-with-total-value-divisible-by-k](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/3619-count-islands-with-total-value-divisible-by-k) |
## Matrix
|  |
| ------- |
| [0054-spiral-matrix](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0054-spiral-matrix) |
| [0130-surrounded-regions](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0130-surrounded-regions) |
| [1020-number-of-enclaves](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/1020-number-of-enclaves) |
| [3619-count-islands-with-total-value-divisible-by-k](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/3619-count-islands-with-total-value-divisible-by-k) |
## Graph Theory
|  |
| ------- |
| [0207-course-schedule](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0207-course-schedule) |
| [0210-course-schedule-ii](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0210-course-schedule-ii) |
| [0802-find-eventual-safe-states](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0802-find-eventual-safe-states) |
## Topological Sort
|  |
| ------- |
| [0207-course-schedule](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0207-course-schedule) |
| [0210-course-schedule-ii](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0210-course-schedule-ii) |
| [0802-find-eventual-safe-states](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0802-find-eventual-safe-states) |
## Directed Acyclic Graph
|  |
| ------- |
| [0207-course-schedule](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0207-course-schedule) |
## Kosaraju's Algorithm
|  |
| ------- |
| [0802-find-eventual-safe-states](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0802-find-eventual-safe-states) |
## Tarjan's SCC Algorithm
|  |
| ------- |
| [0802-find-eventual-safe-states](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0802-find-eventual-safe-states) |
## Binary Search
|  |
| ------- |
| [0540-single-element-in-a-sorted-array](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0540-single-element-in-a-sorted-array) |
| [0744-find-smallest-letter-greater-than-target](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0744-find-smallest-letter-greater-than-target) |
## Simulation
|  |
| ------- |
| [0054-spiral-matrix](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0054-spiral-matrix) |
## Hash Table
|  |
| ------- |
| [0001-two-sum](https://github.com/shahida7135-code/SQL-Injection-Detection-Using-ML/tree/master/0001-two-sum) |
<!---LeetCode Topics End-->