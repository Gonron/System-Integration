{
 "cells": [
  {
   "cell_type": "code",
   "execution_count": 3,
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "Listening on port 8000...\n",
      "[(42069, 'daniboi', 123.0)]\n"
     ]
    },
    {
     "name": "stderr",
     "output_type": "stream",
     "text": [
      "127.0.0.1 - - [15/Sep/2020 12:16:20] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 12:16:22] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 12:16:36] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 12:16:38] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 12:16:47] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 12:16:49] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 12:18:39] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 12:18:44] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 12:18:46] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 13:12:36] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 13:12:38] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 13:12:59] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 13:13:01] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 13:13:03] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 13:13:05] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 13:13:07] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 13:13:09] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 13:14:40] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 13:14:42] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 13:14:44] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 13:14:46] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 13:14:48] \"POST / HTTP/1.1\" 200 -\n",
      "127.0.0.1 - - [15/Sep/2020 13:14:50] \"POST / HTTP/1.1\" 200 -\n"
     ]
    },
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "\n",
      "Keyboard interrupt received, exiting.\n"
     ]
    },
    {
     "ename": "NameError",
     "evalue": "name 'sys' is not defined",
     "output_type": "error",
     "traceback": [
      "\u001b[1;31m---------------------------------------------------------------------------\u001b[0m",
      "\u001b[1;31mKeyboardInterrupt\u001b[0m                         Traceback (most recent call last)",
      "\u001b[1;32m<ipython-input-3-d6ba0befbfb6>\u001b[0m in \u001b[0;36m<module>\u001b[1;34m\u001b[0m\n\u001b[0;32m     39\u001b[0m \u001b[1;32mtry\u001b[0m\u001b[1;33m:\u001b[0m\u001b[1;33m\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n\u001b[1;32m---> 40\u001b[1;33m     \u001b[0mserver\u001b[0m\u001b[1;33m.\u001b[0m\u001b[0mserve_forever\u001b[0m\u001b[1;33m(\u001b[0m\u001b[1;33m)\u001b[0m\u001b[1;33m\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n\u001b[0m\u001b[0;32m     41\u001b[0m \u001b[1;32mexcept\u001b[0m \u001b[0mKeyboardInterrupt\u001b[0m\u001b[1;33m:\u001b[0m\u001b[1;33m\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n",
      "\u001b[1;32m~\\Anaconda3\\lib\\socketserver.py\u001b[0m in \u001b[0;36mserve_forever\u001b[1;34m(self, poll_interval)\u001b[0m\n\u001b[0;32m    231\u001b[0m                 \u001b[1;32mwhile\u001b[0m \u001b[1;32mnot\u001b[0m \u001b[0mself\u001b[0m\u001b[1;33m.\u001b[0m\u001b[0m__shutdown_request\u001b[0m\u001b[1;33m:\u001b[0m\u001b[1;33m\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n\u001b[1;32m--> 232\u001b[1;33m                     \u001b[0mready\u001b[0m \u001b[1;33m=\u001b[0m \u001b[0mselector\u001b[0m\u001b[1;33m.\u001b[0m\u001b[0mselect\u001b[0m\u001b[1;33m(\u001b[0m\u001b[0mpoll_interval\u001b[0m\u001b[1;33m)\u001b[0m\u001b[1;33m\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n\u001b[0m\u001b[0;32m    233\u001b[0m                     \u001b[1;31m# bpo-35017: shutdown() called during select(), exit immediately.\u001b[0m\u001b[1;33m\u001b[0m\u001b[1;33m\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n",
      "\u001b[1;32m~\\Anaconda3\\lib\\selectors.py\u001b[0m in \u001b[0;36mselect\u001b[1;34m(self, timeout)\u001b[0m\n\u001b[0;32m    322\u001b[0m         \u001b[1;32mtry\u001b[0m\u001b[1;33m:\u001b[0m\u001b[1;33m\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n\u001b[1;32m--> 323\u001b[1;33m             \u001b[0mr\u001b[0m\u001b[1;33m,\u001b[0m \u001b[0mw\u001b[0m\u001b[1;33m,\u001b[0m \u001b[0m_\u001b[0m \u001b[1;33m=\u001b[0m \u001b[0mself\u001b[0m\u001b[1;33m.\u001b[0m\u001b[0m_select\u001b[0m\u001b[1;33m(\u001b[0m\u001b[0mself\u001b[0m\u001b[1;33m.\u001b[0m\u001b[0m_readers\u001b[0m\u001b[1;33m,\u001b[0m \u001b[0mself\u001b[0m\u001b[1;33m.\u001b[0m\u001b[0m_writers\u001b[0m\u001b[1;33m,\u001b[0m \u001b[1;33m[\u001b[0m\u001b[1;33m]\u001b[0m\u001b[1;33m,\u001b[0m \u001b[0mtimeout\u001b[0m\u001b[1;33m)\u001b[0m\u001b[1;33m\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n\u001b[0m\u001b[0;32m    324\u001b[0m         \u001b[1;32mexcept\u001b[0m \u001b[0mInterruptedError\u001b[0m\u001b[1;33m:\u001b[0m\u001b[1;33m\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n",
      "\u001b[1;32m~\\Anaconda3\\lib\\selectors.py\u001b[0m in \u001b[0;36m_select\u001b[1;34m(self, r, w, _, timeout)\u001b[0m\n\u001b[0;32m    313\u001b[0m         \u001b[1;32mdef\u001b[0m \u001b[0m_select\u001b[0m\u001b[1;33m(\u001b[0m\u001b[0mself\u001b[0m\u001b[1;33m,\u001b[0m \u001b[0mr\u001b[0m\u001b[1;33m,\u001b[0m \u001b[0mw\u001b[0m\u001b[1;33m,\u001b[0m \u001b[0m_\u001b[0m\u001b[1;33m,\u001b[0m \u001b[0mtimeout\u001b[0m\u001b[1;33m=\u001b[0m\u001b[1;32mNone\u001b[0m\u001b[1;33m)\u001b[0m\u001b[1;33m:\u001b[0m\u001b[1;33m\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n\u001b[1;32m--> 314\u001b[1;33m             \u001b[0mr\u001b[0m\u001b[1;33m,\u001b[0m \u001b[0mw\u001b[0m\u001b[1;33m,\u001b[0m \u001b[0mx\u001b[0m \u001b[1;33m=\u001b[0m \u001b[0mselect\u001b[0m\u001b[1;33m.\u001b[0m\u001b[0mselect\u001b[0m\u001b[1;33m(\u001b[0m\u001b[0mr\u001b[0m\u001b[1;33m,\u001b[0m \u001b[0mw\u001b[0m\u001b[1;33m,\u001b[0m \u001b[0mw\u001b[0m\u001b[1;33m,\u001b[0m \u001b[0mtimeout\u001b[0m\u001b[1;33m)\u001b[0m\u001b[1;33m\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n\u001b[0m\u001b[0;32m    315\u001b[0m             \u001b[1;32mreturn\u001b[0m \u001b[0mr\u001b[0m\u001b[1;33m,\u001b[0m \u001b[0mw\u001b[0m \u001b[1;33m+\u001b[0m \u001b[0mx\u001b[0m\u001b[1;33m,\u001b[0m \u001b[1;33m[\u001b[0m\u001b[1;33m]\u001b[0m\u001b[1;33m\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n",
      "\u001b[1;31mKeyboardInterrupt\u001b[0m: ",
      "\nDuring handling of the above exception, another exception occurred:\n",
      "\u001b[1;31mNameError\u001b[0m                                 Traceback (most recent call last)",
      "\u001b[1;32m<ipython-input-3-d6ba0befbfb6>\u001b[0m in \u001b[0;36m<module>\u001b[1;34m\u001b[0m\n\u001b[0;32m     42\u001b[0m     \u001b[0mprint\u001b[0m\u001b[1;33m(\u001b[0m\u001b[1;34m\"\\nKeyboard interrupt received, exiting.\"\u001b[0m\u001b[1;33m)\u001b[0m\u001b[1;33m\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n\u001b[0;32m     43\u001b[0m     \u001b[0mconn\u001b[0m\u001b[1;33m.\u001b[0m\u001b[0mclose\u001b[0m\u001b[1;33m(\u001b[0m\u001b[1;33m)\u001b[0m\u001b[1;33m\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n\u001b[1;32m---> 44\u001b[1;33m     \u001b[0msys\u001b[0m\u001b[1;33m.\u001b[0m\u001b[0mexit\u001b[0m\u001b[1;33m(\u001b[0m\u001b[1;36m0\u001b[0m\u001b[1;33m)\u001b[0m\u001b[1;33m\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n\u001b[0m",
      "\u001b[1;31mNameError\u001b[0m: name 'sys' is not defined"
     ]
    }
   ],
   "source": [
    "from xmlrpc.server import SimpleXMLRPCServer\n",
    "import os\n",
    "import sqlite3\n",
    "\n",
    "# Set path to DB file\n",
    "db_path = \"db.sql\"\n",
    "\n",
    "# Create DB connection\n",
    "conn = None\n",
    "try:\n",
    "    conn = sqlite3.connect(db_path)\n",
    "except Error as e:\n",
    "    print(e)\n",
    "\n",
    "# add customer to DB\n",
    "def add_new_customer(accnum, name, amount):\n",
    "    c = conn.cursor()\n",
    "    c.execute(f\"\"\"INSERT INTO Customer (accnum, name, amount)\n",
    "                  VALUES ({accnum}, '{name}', {amount});\"\"\")\n",
    "    conn.commit()\n",
    "    r = os.path.getsize(db_path)\n",
    "    return r\n",
    "\n",
    "# Get all customers from DB\n",
    "def get_all_customers():\n",
    "    c = conn.cursor()\n",
    "    r = list(c.execute('SELECT * FROM Customer;'))\n",
    "    return r\n",
    "\n",
    "# Remove all customers from DB\n",
    "def clear_db():\n",
    "    c = conn.cursor()\n",
    "    c.execute('DELETE FROM Customer WHERE 1=1;')\n",
    "    conn.commit()\n",
    "    return True\n",
    "\n",
    "# Start RPC server\n",
    "server = SimpleXMLRPCServer((\"localhost\", 8000))\n",
    "print(\"Listening on port 8000...\")\n",
    "\n",
    "# Add all the function to the RPC Server\n",
    "server.register_function(add_new_customer, \"add_new_customer\")\n",
    "server.register_function(get_all_customers, \"get_all_customers\")\n",
    "server.register_function(clear_db, \"clear_db\")\n",
    "\n",
    "# Start the server\n",
    "try:\n",
    "    server.serve_forever()\n",
    "except KeyboardInterrupt:\n",
    "    print(\"\\nKeyboard interrupt received, exiting.\")\n",
    "    conn.close()\n",
    "    sys.exit(0)"
   ]
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Python 3",
   "language": "python",
   "name": "python3"
  },
  "language_info": {
   "codemirror_mode": {
    "name": "ipython",
    "version": 3
   },
   "file_extension": ".py",
   "mimetype": "text/x-python",
   "name": "python",
   "nbconvert_exporter": "python",
   "pygments_lexer": "ipython3",
   "version": "3.7.3"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 2
}
