**Intent-Based File Search**  

A **Windows-based** intent-driven file search system that **goes beyond keyword matching** by interpreting user intent (natural language queries) and mapping it to structured file-system operations.  

This project focuses on search logic and intent parsing  
________________________________________
**Motivation**  
Traditional file search relies on:  
•	Exact filenames  
•	Rigid filters (date, type, size)  
•	Manual trial-and-error  
**This tool aims to answer queries like** :  
•	"The Mathematics additional pdf of circles i got 2 years ago"  
•	"The Hostel document i downloaded last week"  
•	"My latest resume"  
by translating natural language intent into executable search constraints.  
________________________________________  
**Core Idea**  
Natural Language → Structured Intent → Optimized File Query  
Instead of searching strings, the system:  
1.	Parses intent from user input  
2.	Extracts semantic constraints (time, type, topic, action)  
3.	Maps them to file metadata and system calls  
4.	Ranks results based on intent relevance  
________________________________________  
**Key Features**  
•	**Intent Parsing Layer**  
Converts free-form queries into structured search intents (time ranges, file types, actions, topics).  
•	**Semantic Time Resolution**  
Handles expressions like yesterday, last week, recent, converting them into concrete timestamps.  
•	**Metadata-Aware Search**  
Uses file metadata (modified time, extension, directory context) instead of filename-only matching.  
•	**Ranking & Scoring Layer**  
Results are ranked based on intent satisfaction rather than binary matches.  
•	**Offline & Lightweight**  
Designed to work without cloud APIs or heavy ML models.   
________________________________________   
**System Architecture**  
User Input --> Sematic Time Resolution --> Intent Prasing (time ranges, file types etc.) --> Searching and Scoring --> Shows relavant File(s)  
________________________________________
**Tech Stack**  
•	Language: Java  
•	Platform: Windows  
•	Access: via Java NIO  
•	Design Focus:  
o	Intent-to-system mapping  
o	Modular, extensible architecture   
________________________________________  
**Why This Project Matters**  
This project demonstrates:  
•	Real-world **systems thinking** (not just algorithms)   
•	Translation between human language and File-meta datas   
•	Foundations **relevant to desktop automation, intelligent agents, and OS tooling**  
________________________________________
**Limitations (Current)**   
•	No full NLP model (rule + pattern based)   
•	Some parts are Windows-only    
•	Limited semantic understanding (intent depth is intentionally constrained)   
________________________________________   
**Future Improvements**   
•	Pluggable NLP layer (lightweight ML / embeddings)   
•	Cross-platform abstraction   
•	Learning-based ranking from user behavior   
•	Integration with desktop automation workflows   
________________________________________   
Author  
Arnav Sachdeva  
Computer Science and Engineering   
Punjab Engineering College, Chandigarh  
(2024 - 2028)

