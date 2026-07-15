import subprocess
import csv
import os

TSHARK = r"C:\Program Files\Wireshark\tshark.exe"

INTERFACE = "5"      # apna WiFi interface number
CSV_FILE = "network_live_2.csv"

fields = [
    "frame.number",
    "frame.time",
    "ip.src",
    "ip.dst",
    "tcp.srcport",
    "tcp.dstport",
    "udp.srcport",
    "udp.dstport",
    "_ws.col.Protocol",
    "frame.len",
    "_ws.col.info"
]

if not os.path.exists(CSV_FILE):
    with open(CSV_FILE, "w", newline="", encoding="utf-8") as f:
        writer = csv.writer(f)
        writer.writerow([
            "PacketNo",
            "Time",
            "SourceIP",
            "DestinationIP",
            "TCP_SourcePort",
            "TCP_DestinationPort",
            "UDP_SourcePort",
            "UDP_DestinationPort",
            "Protocol",
            "PacketLength",
            "Information"
        ])

command = [
    TSHARK,
    "-i", INTERFACE,
    "-l",
    "-T", "fields"
]

for field in fields:
    command.extend(["-e", field])

command.extend([
    "-E", "header=n",
    "-E", "separator=,",
    "-E", "quote=d"
])

process = subprocess.Popen(
    command,
    stdout=subprocess.PIPE,
    stderr=subprocess.DEVNULL,
    text=True,
    encoding="utf-8",
    errors="ignore"
)

print("Live Capture Started...")

with open(CSV_FILE, "a", newline="", encoding="utf-8") as csvfile:

    writer = csv.writer(csvfile)

    for line in process.stdout:

        row = line.strip().split(",")

        while len(row) < 11:
            row.append("")

        writer.writerow(row)

        csvfile.flush()

        print(row)